DROP TABLE IF EXISTS CLIENTS CASCADE;
DROP TABLE IF EXISTS CREDITS CASCADE;

CREATE TABLE IF NOT EXISTS CLIENTS
(
    uuid         uuid PRIMARY KEY,
    full_name    varchar(60) NOT NULL,
    phone_number varchar(60) NOT NULL,
    email        VARCHAR(60) Not Null,
    passport     BIGINT      NOT NULL
);

CREATE TABLE IF NOT EXISTS CREDITS
(
    uuid          uuid PRIMARY KEY,
    credit_limit  BIGINT NOT NULL,
    interest_rate DOUBLE NOT NULL
);