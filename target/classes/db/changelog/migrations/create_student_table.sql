create table student
(
    id         int primary key AUTO_INCREMENT,
    name       varchar(255) not null,
    surname    varchar(255) not null,
    middlename varchar(255) not null,
    bDay       date         not null,
    groupName  varchar(255) not null
);