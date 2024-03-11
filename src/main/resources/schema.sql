DROP TABLE IF EXISTS clients CASCADE;

CREATE TABLE IF NOT EXISTS clients
(
    uuid         uuid PRIMARY KEY,
    full_name    varchar(60) NOT NULL,
    phone_number varchar(60) NOT NULL,
    email        VARCHAR(60) Not Null,
    passport     BIGINT      NOT NULL
);