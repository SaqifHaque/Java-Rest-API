drop database todo_db;
drop user saqif;
create user saqif with password 'legend';
create database todo_db with template=template0 owner=saqif;
\connect todo_db;
alter default privileges grant all on tables to saqif;
alter default privileges grant all on sequences to saqif;

create table todo_users(
    user_id integer primary  key not null,
    first_name varchar(20) not null,
    last_name varchar(20) not null,
    email varchar(30) not null,
    password text not null
);

create table todo(
    task_id integer primary key not null,
    task_name varchar(50) not null,
    status varchar(50) not null,
    user_id integer not null
);
alter table todo add constraint cat_users_fk
foreign key (user_id) references todo_users(user_id);

create sequence todo_users_seq increment 1 start 1;
create sequence todo_seq increment 1 start 1;