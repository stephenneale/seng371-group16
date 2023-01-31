Requirements Document
=====================

## Document Revisions

| Version | When            | Who                    | What                                      |
| ---     | ---             | ---                    | ---                                       |
| v1.0    | 2023-01-27      | Developer team         | Initial drafting                          |

## Table of Contents

_todo: table of contents_ at end when were done, Drew can tackle this

## 1 Introduction

### 1.1 Purpose

Requirements Document (referred to as RD) 1.0, highlights the functionality of Dimspace, an easy to use online web application for the delivery UVic course content. Students at UVic find the currently in use "Brightspace" web app to be slow and difficult to use, so a new intuitive software solution is needed to streamline the online course delivery process.

### 1.2 Project Scope

The scope of this project is to alleviate the confusing layout of Brightspace, and to cut down on the amount of time it takes for students to find lecture slides, assignment deadlines, and grades for their courses. As the majority of courses at UVic provide content online, a system with an easier to use interface would greatly cut down on student confusion. The new web app will similarly host all course content, grades, and deadlines as the current service. It is yet to be determined if migration of existing course data to a new database would be required, or the current database can be repurposed.

### 1.3 Glossary of Terms

_some sort of table here..._

### 1.4 Overview

## 2 Overall Description

### 2.1 Product Perspective

### 2.2 Product Features

### 2.3 User Classes and Characteristics

### 2.4 Operating Environmen

### 2.5 Design and Implementation Constraints

### 2.6 Assumptions and Dependencies

#### 2.6.1 Assumptions

#### 2.6.2 Dependencies

## 3 System Features

### 3.1 Courses

#### 3.1.1 Description and Priority

There are two main account types for the courses section, students and instructors. A student account will be able to view and access course content for only courses that they are registered in. The homepage consists of a catalouge of courses that the student has registered in. The instructors account will only have access to courses that they own and will be able to control what the students have access to with-in their own course. They will also have a similar homepage which displays a catalouge of courses which they own. This feauture is of **high priority**.
#### 3.1.2 Functional Requirements

REQ-1-1: Each homepage must only show courses that a student is registered in or an intructor owns

REQ-1-2: Each course must display the course name, course number and the section that the student belongs to

REQ-1-3: If a course is dropped by a student, they can no longer view that course on their homepage catalouge

### 3.2 Course Content

#### 3.2.1 Description and Priority

On any of their courses, instructors may post notes that are visible to students. These notes can
contain arbitrary attachment files (e.g. PDF lecture slides, Excel spreadsheets, etc). Additionally,
some of these notes can be designated as Assignment notes. Students may upload their own files to
these assignment notes, and professors can view everything that each student uploaded, and respond
to each of these submissions with grades and feedback. Students can only view the files they have
submitted and the grades they received on their own work (students can't see each others submissions
or grades). This feature if of **high priority**.

#### 3.2.2 Functional Requirements

REQ-2-1: Instructors may post notes (discrete bulletin style messages) to their course pages.

REQ-2-2: Instructors may add arbitrary file attachments to these notes that may be viewed and
downloaded by students

REQ-2-3: Students see all notes that instructors post on course pages in reverse chronological
order on the respective course page

REQ-2-4: Instructors may designate specific notes to accept assignment submissions. Students can upload
files to these assignment notes, which are in turn visible to the instructor. These submissions
are visible only to the student who uploaded them, and the instructor.

REQ-2-5: Instructors may assign grades (decimal number from 0.0 to 100.0) to each student's submission,
which the student can see in the place where they submitted their assignment.

REQ-2-6: Instructors may optionally set a due date for assignments, after which students cannot
submit anything further.

### 3.3 Grades

_this section describes the funcitonality of students being able to see all their graded items for
a course in one place, spreadsheet style._

#### 3.3.1 Description and Priority

#### 3.3.2 Functional Requirements

### 3.4 Self-adaptation

#### 3.4.1 Description and Priority

The system should adapt to patterns it observes in its users' behaviour in order to make their use
of the software more convenient. It should provide quick links to places within the site (notes,
assignments, other pages) that users access either often, or recently. ("Frecently") Additionally,
the system should continually test at what times users are most receptive to notifications about
upcoming deadlines, and adjust email notifications to be sent at times that users open them most
reliably.

#### 3.4.2 Functional Requirements

REQ-4-1: The user's homepage should have a list of links generated based on what they visit both
frequently and recently, based on some reasonable implementation of the "frecency" algorithm.

REQ-4-2: Users should be reminded of upcoming deadlines by email, and the system should keep track
of what email notification times are most likely to correlate with system interaction shortly after
delivery. Then, notification delivery times should be tuned closer to these times.

## 4 External Interface Requirements

### 4.1 User Interfaces

The user interface is the primary interface of this system, as it is otherwise quite self-contained.
Students and instructors access the system by way of a web-app, which shows (in the case of students)
all courses that they are registered to and can view, and (in the case of instructors) all courses
that they administer. Users can interact with this in a standard web-app fashion (point with mouse
pointer and click, keyboard, etc), as a later-stage goal this interface should be accessible to users
with a wide variety of ability. In particular, it should play nice with screen readers, and shouldn't
communicate essential information using colour in a way that would cause difficulties for people with
colour blindness.

### 4.2 Hardware Interfaces

Given that this is primarily a software system, hardware details will be left to a cloud service vendor
such as Amazon AWS, Google Cloud, or Microsoft Azure. We only require that the service be performant (as
described in section 5 of this document), which does involve hardware considerations, but those are outside
the scope of this document.

### 4.3 Software Interfaces

The system will interface with a database to durably store information.

### 4.4 Communications Interfaces

The system will be accessible through the Internet, so that students and instructors can view their
courses from anywhere with an Internet connection.

## 5 Other Non-Functional Requirements

### 5.1 Performance Requirements

The system needs to run at high speeds, 24/7, with low failure rate. Due to students needing a reliable system, it should be stress tested for 160+ hours a week and a capacity of 2500+ students at one time. System updates must happen live or nearly live as this ensures students will not need to worry about down times interupting their studies. 
### 5.2 Security Requirements

Account and data secuirty are important as the system will be holding data of students such as names, student number, email and grades. The system will also be holding the class lectures and notes/assignments created by professors at the school which needs to protected.
### 5.3 Software Quality Attributes

The system needs to be modifiable and adaptable because this ensures the longetivity of the software as it can be evolved and kept up to date with new requirtments and features. Scalaiblity is also a key component as the number of students at post-secondary institutions can be large. 
