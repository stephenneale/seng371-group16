Feature List for Client RFP
===========================

These are the basic features we'd like to implement for our LMS system, that we'd like to
see our client group include in their RFP.

## Core Features

- User Accounts
  - Two user account types: instructor and student
- Courses
  - Students can belong to a number of courses, each course has a set of students
  - Each course has an instructor, the instructor may upload Postings to their course(s)
- Postings
  - Postings may be Notes or Assignments
  - Notes are simple text/file submissions that students can see
  - Assignments are special Notes that students may upload files to
    - Instructors can see the files that students upload to Assignments and assign a grade
to each submission, which the student can see.
- Grades
  - Students can see the grades that they received in Courses/Assignments
- Home Page
  - The page that users first see when they log into the site contains a collection
of all their courses. For students, courses they are a part of. For instructors, courses
they teach.
  - A 'Recent' section on the homepage that automatically updates with the user's common
destinations sorted using [Frecency](https://en.wikipedia.org/wiki/Frecency).
    - For the purposes of the Recent section, a "destination" could be a course home page,
or a Posting from any course.

## Characteristics

- Postings in Courses are organized in reverse chronological order for viewing by the students---
all on one page.
- The system is not noticeably slow in loading user interface elements to the browser
- Context menus are available wherever they could be reasonably expected
- Mobile device optimized
