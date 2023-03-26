Assignment 3
============


## Root Cause Analysis

## GQM

For the GQM, we identified 5 important requirements that our system has and analysed them further to ensure we push out
a high quality software. The GQM method assisted us in identifying how we would do this. The Goal phase aimed our
thinking in the direction that we needed by creating a specific goal. The question phase allowed us to identify possible
ways to ensure our requirements are met at a high standard and how we would collect the data to aid our development
process. The final stage metrics, had us quantify our goals and questions so the development team has data that they
need to analyse and ensure a continuous process of pushing out high quality software.

[Please follow this link to view our GQM.](as-developers/Assignment\ 3/goal-quality-metric.md)

## Implement the Application 100%

For our implementation of the application, we decided to focus on a few core areas:

- Login/authentication,
- Grades, and
- Recently Viewed (self-adaptation).

We added a grades page that shows the mark a student achieved on each assignment, exam, or quiz to date in one place.
The intention is that this page would collate information from across the user's courses in one place. Since our test
app at the moment has only one course, only data from that single course is shown.

The Recently Viewed section highlights pieces of course content that the user has most recently viewed. The intention
was that this would adapt to the user's behaviour using Frecency (the combination of frequency and recency), but it was
not feasible to implement this in time. Instead, Recently Viewed shows pages that the user has been to most recently
only (with frequency playing no part). Despite this, the Recently Viewed module is fully functional, and browsing pages
on the app will cause it to update.
