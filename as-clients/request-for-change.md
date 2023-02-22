# Change Request 

## Change Description

| **Project Name:** Atlantean Banking | **Change Name:** Risk Change Authentication | **Number:** 01              |
|-------------------------------------|---------------------------------------------|-----------------------------|
| **Requested By:** Andrew Petten     | **Contact:** andrewpetten@uvic.ca           | **Date:** February 21, 2023 |

### Description of Change: 

In order to address concerns of security and ease-of-use, **[Risk-based Authentication](https://en.wikipedia.org/wiki/Risk-based_authentication)**
should be implemented as part of this project's requirements. This means that every user login attempt should be
evaluated (usually using machine-learning techniques) to create a risk profile for the login attempt. Based on this risk
profile, the user should be presented with identity challenges which are stricter when the login attempt is assessed to
be riskier, and more lenient when the attempt is deemed safer.

Data points that should be considered when evaluating whether a user's risk profile should include:

- IP Address,
- Device location,
- User browser,
- User device,
- Browser cookies, and
- Time since last login.

Identity challenges include (in order from most convenient to most secure):

- Passphrase (this method should be required of all login attempts),
- SMS/Phone one-time password,
- Approval from another device,
- Time-based one-time password, and
- Captcha.

### Reason for Change:

As a bank, the security of our clients' financial assets and personal information is of utmost importance. It is
critical that our clients' money and information stays safe. At the same time, it's also (though not as) important that
regular users of our online banking service are not frustrated by excessive login challenges, when usage patterns and
other indicators can clearly show that their attempts to access their own accounts are legitimate.

### Priority (High, Medium or Low):

### Impact on Deliverables:

### Impact of not Responding to change (and Reason Why): 

| **Date Needed:** | **Approval of Request:** | **Date:** |
|------------------|--------------------------|-----------|

| **Change Impact**                |
|----------------------------------|
| Tasks/Scope Affected:            |
| Cost of Evaluation:              |
| Risk Evaluation:                 |
| Quality Evaluation:              |
| Additional Resources:            |
| Duration:                        |
| Additional Effort:               |
| Impact on Deadline:              |
| Alternative and Reccomendations: |
