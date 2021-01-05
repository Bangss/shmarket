create database shmarket;

create table if not exists chat
(
    chat_id   int auto_increment comment '聊天室编号'
        primary key,
    s_id      int                                 not null comment '卖家',
    b_id      int                                 not null comment '买家',
    send_time timestamp default CURRENT_TIMESTAMP null comment '发送时间',
    content   varchar(200)                        not null comment '内容',
    is_read   int       default 0                 not null comment '是否已读
0：未读
1：已读'
)
    comment '聊天室';

create table if not exists classes
(
    c_id   int auto_increment comment '类别编号'
        primary key,
    c_name varchar(30) null comment '类别名称',
    c_num  int         null comment '该类商品总数'
)
    comment '类别表';

create table if not exists comment
(
    o_id     int                                 not null comment '订单号',
    content  varchar(200)                        not null comment '内容',
    evaluate int                                 not null comment '星星（1-2：差评，3-4：中评，5：好评）',
    com_time timestamp default CURRENT_TIMESTAMP not null comment '评价时间',
    primary key (o_id, com_time)
)
    comment '评价表';

create table if not exists department
(
    dep_id   int auto_increment comment '学院编号'
        primary key,
    dep_name varchar(30) null comment '学院名称'
)
    comment '学院表';

create table if not exists fans
(
    user_id int not null comment '用户编号',
    fans_id int not null comment '粉丝编号',
    primary key (fans_id, user_id)
)
    comment '粉丝表';

create table if not exists goods
(
    g_id     int auto_increment comment '商品编号，自动增长'
        primary key,
    g_name   varchar(30)                         not null comment '商品名称',
    user_id  int                                 not null comment '店家编号',
    price    int                                 not null comment '单价',
    c_id     int                                 null comment '类别编号',
    up_time  timestamp default CURRENT_TIMESTAMP null comment '上架时间',
    like_num int       default 0                 null comment '点赞数',
    hate_num int       default 0                 null comment '差评数',
    want_num int       default 0                 null comment '想要数',
    m_id     int                                 null comment '留言',
    photo    mediumblob                          not null comment '图片',
    video    mediumblob                          null comment '视频'
)
    comment '商品表';

create table if not exists login
(
    id       int         not null comment '登录账号（用户编号）',
    phone    varchar(20) null comment '手机号',
    email    varchar(50) null comment '邮箱',
    password varchar(20) null comment '密码',
    code     varchar(10) null comment '验证码',
    power    int         null comment '权力',
    constraint login_email_uindex
        unique (email),
    constraint login_phone_uindex
        unique (phone)
)
    comment '登录表';

create table if not exists msg
(
    m_id     int auto_increment comment '编号'
        primary key,
    user_id  int                                 not null comment '留言人编号',
    content  varchar(60)                         not null comment '内容',
    parents  int                                 null comment '父结点',
    kids     int                                 null comment '子结点',
    m_time   timestamp default CURRENT_TIMESTAMP null comment '留言时间',
    like_num int       default 0                 not null comment '点赞数'
)
    comment '留言表';

create table if not exists `order`
(
    o_id        int auto_increment comment '订单编号，自动增长'
        primary key,
    g_id        int                                 not null comment '商品编号',
    s_id        int                                 not null comment '卖家编号',
    b_id        int                                 not null comment '买家编号',
    o_time      timestamp default CURRENT_TIMESTAMP null comment '下单时间',
    price       int                                 not null comment '价格',
    sale_time   timestamp                           null on update CURRENT_TIMESTAMP comment '支付时间',
    finish_time timestamp default CURRENT_TIMESTAMP null comment '交易完成时间',
    state       int       default 0                 not null comment '订单状态
0：待支付
1：已支付
2：已取消
3：申请退款中
4：退款成功
5：退款失败'
)
    comment '订单表';

create table if not exists user
(
    user_id    int auto_increment comment '用户编号'
        primary key,
    user_name  varchar(10) null comment '真实名字',
    nickname   varchar(10) null comment '昵称',
    dep_id     int         null comment '学院编号',
    user_class varchar(20) null comment '班别',
    sex        varchar(5)  null comment '性别',
    age        int         null comment '年龄',
    phone      varchar(20) null comment '手机号',
    email      varchar(50) null comment '邮箱',
    wechat     varchar(30) null comment '微信',
    qq         int         null comment 'QQ',
    remark     varchar(60) null comment '个性签名',
    prestige   int         null comment '信誉（0-100）',
    role       int         null comment '身份'
)
    comment '用户表';


