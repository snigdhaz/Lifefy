use Customer_info;
select * from login_info;
select * from users;
describe users;
ALTER TABLE users modify COLUMN phoneno char(10);
describe login_info;
ALTER TABLE login_info ADD FOREIGN KEY (username) REFERENCES users(username);
select * from login_info;
select * from users;
SELECT EXISTS(SELECT * from login_info WHERE username= 'j' and password ='p');



use Money_management;

show tables;
describe telephone_bill;
describe water_bill;
describe e_bill;
describe wifi_bill;
ALTER TABLE telephone_bill modify COLUMN phone_number char(10);
SET FOREIGN_KEY_CHECKS = 0;
-- ALTER TABLE telephone_bill modify COLUMN username varchar(30);
-- ALTER TABLE water_bill modify COLUMN username varchar(30);
-- ALTER TABLE e_bill modify COLUMN username varchar(30);
-- ALTER TABLE wifi_bill modify COLUMN username varchar(30);
SET FOREIGN_KEY_CHECKS = 1;
ALTER TABLE water_bill modify COLUMN residential_complex varchar(200);
ALTER TABLE wifi_bill modify COLUMN Plan_chosen varchar(10);
ALTER TABLE wifi_bill modify COLUMN Service_id varchar(10);
select * from telephone_bill;
select * from water_bill;
select * from e_bill;
select * from wifi_bill;

-----

use Personal_care;
show tables;
describe health_tracker;
describe rate_health;
ALTER TABLE rate_health ADD water boolean;
ALTER TABLE rate_health ADD sleep boolean;
ALTER TABLE rate_health ADD meditate boolean;
ALTER TABLE rate_health ADD exercise boolean;
ALTER TABLE rate_health ADD stretch boolean;
ALTER TABLE rate_health ADD walk boolean;
ALTER TABLE rate_health ADD screen_time boolean;
describe rate_health;
select * from rate_health;
ALTER TABLE rate_health modify COLUMN username varchar(30);
INSERT INTO rate_health VALUES ('josh234','2021-09-13','12',1,0,1,0,0,1,0);
UPDATE rate_health SET health_score = 15, water =1 ,sleep=0,meditate=1 , stretch= 1, walk= 0, screen_time=1, exercise=1 WHERE Date = '2021-09-13' and username ="josh234";
ALTER TABLE rate_health
DROP PRIMARY KEY;
ALTER TABLE rate_health
ADD PRIMARY KEY (username,Date);

INSERT INTO rate_health VALUES ('jhon',CURDATE(),14,false,true,false,false,true,false,false);
ALTER TABLE rate_attitude DROP PRIMARY KEY;
ALTER TABLE rate_attitude
ADD PRIMARY KEY (username,Date);
describe rate_attitude;
ALTER TABLE rate_attitude ADD laugh boolean;
ALTER TABLE rate_attitude ADD gratitude boolean;
ALTER TABLE rate_attitude ADD reflection boolean;
ALTER TABLE rate_attitude ADD positive boolean;
ALTER TABLE rate_attitude ADD read_book boolean;
ALTER TABLE rate_attitude ADD smile boolean;
ALTER TABLE rate_attitude ADD lend boolean;
ALTER TABLE rate_attitude modify COLUMN username varchar(30);

select * from rate_attitude;

select * from health_tracker;
describe health_tracker;
ALTER TABLE health_tracker modify COLUMN username varchar(30);
ALTER TABLE health_tracker DROP PRIMARY KEY;
ALTER TABLE health_tracker
ADD PRIMARY KEY (username,Date);
ALTER TABLE health_tracker 
ADD COLUMN diet TEXT;
ALTER TABLE health_tracker 
ADD COLUMN workout TEXT;


---
describe mini_diary;
ALTER TABLE mini_diary modify COLUMN username varchar(30);
ALTER TABLE mini_diary 
modify COLUMN daily_notes TEXT;
ALTER TABLE mini_diary
ADD PRIMARY KEY (username,Date);
select * from mini_diary;

-- 
describe mood_tracker;
ALTER TABLE mood_tracker modify COLUMN username varchar(30);
ALTER TABLE mood_tracker
ADD PRIMARY KEY (username,Date);
select * from mood_tracker;