如何开启MySQL的远程帐号-2）创建远程登陆用户并授权
> grant all PRIVILEGES on test_db.* to root@'192.168.1.101'  identified by '123456';
上面的语句表示将 test_db 数据库的所有权限授权给 root 这个用户，允许 root 用户在 192.168.1.101 这个 IP 进行远程登陆，并设置 root 用户的密码为 123456
