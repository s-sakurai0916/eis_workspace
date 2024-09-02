create user 'app_user'@'%' identified by 'appUserPassword';
grant select,insert,update,delete on eis_db.* to 'app_user'@'%';

CREATE TABLE test_table (id int unsigned AUTO_INCREMENT primary key , value varchar(50));
INSERT INTO test_table (value) VALUES ('テスト');