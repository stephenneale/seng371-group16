# Requirment 1 Course Content Uploading

## Goal
| Topic        | Response                                                     |
|--------------|--------------------------------------------------------------|
| Object:      | Course Content Data storage                                  |
| Purpose:     | Instructors can post all materials for course                |
| Focus:       | Impact of all Professors adding all of their course material |
| Viewpoint:   | Instructors                                                  |
| Environment: | DimSpace                                                     |

## Question
- How much data can we currently store?
- How much data do we currently have stored?
- What happens when we store more then we have access too?
- Is the data being backed-up?
- Whats the maximum file size that can be uploaded?

## Metrics
- Check server for avaialable data storage and Upload Limits
- Check with Uvic IT how much information their currenty have stored on current system
- Check back-up records for most recent back up
- Run upload tests

# Requirment 2 Student Capacity

| Topic        | Response                                                     |
|--------------|--------------------------------------------------------------|
| Object:      | Server Capacity                                              |
| Purpose:     | Every student can access the system                          |
| Focus:       | Number of studrnts server can hold                           |
| Viewpoint:   | Students                                                     |
| Environment: | DimSpace                                                     |

## Question
- How many students does Uvic Currently have on Brightspace?
- What is the maximum capactity of students on the server?
- How much student traffic will slow down our application?
- What capacity do we need?
- Can we increse the capacity of people on the server if needed?

## Metrics
- Uvics enrollment data
- Look at current server for average students on Brightspace at any given time
- Run Load tests
- Run Performance tests
- Run stress tests for 160+ hours a week

# Requirment 3 Security

| Topic        | Response                                                     |
|--------------|--------------------------------------------------------------|
| Object:      | Security                                                     |
| Purpose:     | Users data is safely stored and secure                       |
| Focus:       | Security                                                     |
| Viewpoint:   | Users                                                        |
| Environment: | DimSpace                                                     |

## Question
- Does Uvic ever have intrusion attempts? If so how many?
- Do we have vulnerabilites?
- Can we elimiate this vulnerbalities?
- What is Uvics response time to a security breach?

## Metrics
- Identify how many intrustions Uvic currently reciveves?
- Idenitfy the number of vulnerbilites and how many of them we can eliminate
- Run security system tests
- Run a data breach tests and collect Uvics reponse time

# Requirment 4 Notifications

| Topic        | Response                                                     |
|--------------|--------------------------------------------------------------|
| Object:      | Notification System                                          |
| Purpose:     | Determine how useful the system is                           |
| Focus:       | Notififcations                                               |
| Viewpoint:   | Students                                                     |
| Environment: | DimSpace                                                     |

## Question
- Does our system send enough notifications?
- Do students get notified for due dates at proper times?
- How many notifcations do students recieve?
- What is the quality of our notifcation systems?

## Metrics
- Run tests to estimate how many notifications a student will get per day/week
- Implement optional feature that asks student if the notification was to early, on time or too late. Simple 1 click button.
- Run a tests of Mock students and determine how many notifications each Mock student recieved
- Run a student survey each semester that gives a quantatative response on the quality of the notification system


# Requirment 5

| Topic        | Response                                                     |
|--------------|--------------------------------------------------------------|
| Object:      | Grades                                                       |
| Purpose:     | Ussrs can see grades                                         |
| Focus:       | GPA of students                                              |
| Viewpoint:   | Users                                                        |
| Environment: | DimSpace                                                     |

## Question
- Can professors post all grades on assesments and are viewvble by students?
- Are these grades backed-up somewhere?
- Can professors post grades higher then 100%?

## Metrics
- Create unit tests for grades
- Back-up all grades automatically after an instructor posts one
- Create tests for grades higher then %100
- Create tests for automatically calculating overall GPA to ensure no errors are made

# Requirment 6

