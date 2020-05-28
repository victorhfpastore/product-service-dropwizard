--liquibase formatted sql

--changeset taiza:4
create table product (
    id bigint not null auto_increment primary key,
    name varchar(30),
    description varchar(80) not null,
    preco varchar(10)
);