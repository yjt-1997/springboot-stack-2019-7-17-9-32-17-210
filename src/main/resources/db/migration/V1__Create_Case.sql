create table `case`(
    `id` int auto_increment primary key,
    `happened_time` BIGINT,
    `name` varchar(255),
    `composition_id` int,
    `procuratorate_id` int
);