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

_this section describes the functionality of students belonging to courses, profs owning a course,
students having a homepage where they can see their courses. also, here is where we should chat
about the software adaptation (frecency) feature we were talking about._

#### 3.1.1 Description and Priority

#### 3.1.2 Functional Requirements

### 3.2 Course Content

#### 3.2.1 Description and Priority

On any of their courses, instructors may post notes that are visible to students. These notes can
contain arbitrary attachment files (e.g. PDF lecture slides, Excel spreadsheets, etc). Additionally,
some of these notes can be designated as Assignment notes. Students may upload their own files to
these assignment notes, and professors can view everything that each student uploaded, and respond
to each of these submissions with grades and feedback. Students can only view the files they have
submitted and the grades they received on their own work (students can't see each others submissions
or grades).

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

### 3.3 Grades

_this section describes the funcitonality of students being able to see all their graded items for
a course in one place, spreadsheet style._

#### 3.3.1 Description and Priority

#### 3.3.2 Functional Requirements

## 4 External Interface Requirements

### 4.1 User Interfaces

### 4.2 Hardware Interfaces

### 4.3 Software Interfaces

### 4.4 Communications Interfaces

## 5 Other Non-Functional Requirements

### 5.1 Performance Requirements
The system needs to run at high speeds, 24/7, with low failure rate. Due to the students needing a reliable system, it should be stress tested for 160+ hours a week and a capacity of 2500+ students at one time. System updates must happen nelive or nearly live as this ensures students can upload or recieve assignments at the intended time. 
### 5.2 Security Requirements
Account and data secuirty are important as the system will be holding data of students such as names, student number, email and grades. The system will also be holding the class lectures and notes/assignments created by professors at the school which needs to protected.
### 5.3 Software Quality Attributes
Modifiability, scalability, simple to use
