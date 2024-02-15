-- ----------------------------
--  数据库初始化脚本
-- ----------------------------
-- 1. 创建数据库
drop database if exists gemini_generator;

create database gemini_generator default character set utf8mb4 collate utf8mb4_general_ci;

use gemini_generator;

set names utf8mb4;

-- 2. 创建表

-- ----------------------------
--  数据源表
-- ----------------------------
drop table if exists t_datasource;

create table t_datasource
(
    id                bigint unsigned auto_increment                                         not null comment '主键',
    name              varchar(32)                                                            not null comment '数据源名称',
    url               varchar(255)                                                           not null comment '数据源url',
    username          varchar(32)                                                            not null comment '用户名',
    password          varchar(32)                                                            not null comment '密码',
    driver_class_name varchar(64)                                                            not null comment '驱动类名',
    type              tinyint unsigned                                                       not null comment '数据源类型 0:MySQL 1:Oracle 2:SQLServer 3:PostgreSQL',
    description       varchar(255)                                                           not null comment '描述',
    status            tinyint unsigned                                                       not null comment '状态 0:禁用 1:启用',
    tenant_id         bigint unsigned  default 0                                             not null comment '租户id 0:公共租户',
    version           int unsigned     default 0                                             not null comment '版本号',
    deleted           tinyint unsigned default 0                                             not null comment '是否删除 0:否 1:是',
    create_user_id    bigint unsigned  default 0                                             not null comment '创建人id',
    create_user_name  varchar(32)      default ''                                            not null comment '创建人姓名',
    create_time       timestamp        default current_timestamp                             not null comment '创建时间',
    update_user_id    bigint unsigned  default 0                                             not null comment '更新人id',
    update_user_name  varchar(32)      default ''                                            not null comment '更新人姓名',
    update_time       timestamp        default current_timestamp on update current_timestamp not null comment '更新时间',
    primary key (id)
) comment '数据源表';

