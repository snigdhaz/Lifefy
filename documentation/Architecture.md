ii. Features — what features are your UI going to have other than the main idea,
e.g. login/logout, register, settings page, etc. (remember these are very generic
examples, you must provide ones specific to your project)
iii. DB connectors if they are going to be used here (separate modules/pckgs only do
not mix it up with ui code, import and use)


b. Backend
i. API endpoints(one heading for each) — describe the incoming parameters and
the responses and its function
ii. Features if any
iii. DB connectors if they are going to be used here (separate modules,pckgs only do
not mix it up with server code, import and use). Note : one separate class has to
be made for each table or make db modular enough to accept db name and
restrict functions. Since you are new to it I'd suggest making different
classes.(will explain reason in class if needed)



c. Database
i. Tables and their names and purpose
Data Base- Customer_info

Table users
name(varchar)
Username(primary key)
email-id (no dup values)(varchar)
phone number(int)
gender(char(1))
dob(date)

Table Login_info
Username(Primary key)(varchar)
Password(varchar)


Database Money_management

Table E-bill:
Username(foreign key from Customer_info)
Payment_date (date)
Unique_Service_number(Primary key)(char)
Amount (int)
State(varchar)
City(varchar)
Resedential Complex name(varchar)
Meter_no (char)


Table Water-bill:
Username(foreign key from Customer_info)
Payment_date (date)
State(varchar)
City(varchar)
Resedential_Complex_name(varchar)
Unique_Service_number(Primary key)(int)
Amount (int)

Table Phone-bill:
Username(foreign key from Customer_info)
Phone_number(int)
Service_Provider
Payment_date(date)
Plan_choosen (Boolean) 
Amount (int)


Table Wifi-bill:
Service_ID (int)
Service_operator (char)
Plan_choosen (Boolean)
Payment_date (date)
Amount (int)


DataBase : Personal Care

Table Health_Tracker:
Username(foreign key from customer_info)
Date(primary key)
Sleep_Duration (int)
Workout_Duration (int)

Table Rate_Health:
Username(foreign key from customer_info)
Date(primary key)
Health_Score (int)

Table Rate_Attitude:
Username(foreign key from customer_info)
Date(primary key)
Attitude_Score (int)

Table Mood_Tracker:
Username(foreign key from customer_info)
Date(primary key)
Happy_Mood(Boolean)
Sad_Mood(Boolean)
Medium_Mood(Boolean)

Table mini_diary:
Username(foreign key from customer_info)
daily_notes (varchar)





ii. Schema designs




d. Overview
i. Intro to the design of the project
ii. A diagram representing front end back end and arrows showing how they
connect (via HTTP API or via connectors of db)
iii. Give a general flow of the application through a tree diagram (website
navigation chart) e.g., 
