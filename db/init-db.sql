create user 'app_user'@'%' identified by 'appUserPassword';
grant select,insert,update,delete on eis_db.* to 'app_user'@'%';
