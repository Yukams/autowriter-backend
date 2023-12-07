create table IF NOT EXISTS USERS_TEST(
                      ID int not null AUTO_INCREMENT,
                      NAME varchar(100) not null,
                      STATUS int,
                      PRIMARY KEY ( ID )
);