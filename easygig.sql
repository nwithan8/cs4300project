create table venue_post(id int,
 venue_id int,
 post_title varchar(50),
 post_content varchar(200),
 date_posted DATETIME,
 primary key (id));
 
 create table band_post(id int,
 band_id int,
 post_title varchar(50),
 post_content varchar(200),
 date_posted DATETIME,
 primary key (id));
 
 create table account_info(id int,
 username varchar(30),
 pw varchar(30),
 primary key (id));
 
 create table venue(id int,
 venue_name varchar(50),
 description varchar(200),
 telephone varchar(12),
 email varchar(30),
 facebook varchar(30),
 twitter varchar(30),
 youtube varchar(50),
 primary key (id));
 
 create table band(id int,
 band_name varchar(50),
 description varchar(200),
 telephone varchar(12),
 email varchar(30),
 facebook varchar(30),
 twitter varchar(30),
 soundcloud varchar(50),
 youtube varchar(50),
 primary key (id));
