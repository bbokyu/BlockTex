# Check-in 1

***DSL High-Level Purpose***
<p>Increase the accessibility and functionality of LateX by introducing functional components, ability to perform basic arithmetics, and loops.</p> 

***Main Target Users***
<p>New or existing LateX users with minimal familiarity with programming</p>

***Main Features***
- Basic Arithmetic 
- Functional Components
- Loops
- Lists


***Code Snippets***
```
User Test 1: Create 5/4
Create Fraction myFraction
myFraction.numerator = 5
myFraction.denominator = 4
Expected output = “\frac{5}{4}” (prior to UI)


User Test 2: Create 4x4 Identity Matrix using loops
https://www.physicsread.com/latex-identity-matrix/ 


Create Matrix myMatrix
Set Matrix shape = (4, 4)
User provides elements, we create a matrix and position it for them
// myMatrix.elements = 1, 5/4, 100, 25, 20,   ,…
User uses loop key word with variable name to initalize the function
Loop myMatrix -> 
	If Row == Col:
		This = 1
	Else:
		This = 0

// Combining Loops, Conditionals, objects, arithmetics 
Loop myMatrix -> 
	If Row == Col:
		This = myFavFraction * 3
	Else:
		This = 0


```

***Follow-Up***
- Compiled vs. Interpreted
- Error Handling 

___
# Check-in 2

Responsibilities (see notes for Module details below):
Unit Tests: The person writes the code
Documentation: The person writes the code
Module 1: Tokenization + Parsing
Lead: Annie
Module 2: AST Conversion
Lead: Ricky, Bryan
Module 3: Evaluation
Lead: Kevin, Bryan, Ricky, etc.
Module 4: Render/UI
Lead: Cameron
Module 5: End-to-end and Integration Testing
Lead: Bryan, Annie

Roadmap:
Jan 25 - Rough input/outputs of modules, similar to black-box testing (i.e. what will the parse tree output look like, in order to help with the AST interface / tree implementation and planning process)
Jan 26 - Check-in 2 Submission, start diagrams of flow/structure of modules (i.e. our parse tree)
Jan 27 - Reaching out for user studies, meeting on check-in 3, Zoom meeting
Jan 29 - Soft deadline for Check-in 3 
Feb 2 - Check-in 3 (Week 4) Submission, dummy prototype of what website will look like
Feb 3 - User Study Pt 2
Feb 6 - Soft deadline for high level implementation, prototype, testing, etc.
Feb 9 - Milestone 4 (Week 5) Submission
Feb 10 - Meeting
Feb 16 - Milestone 5 (Week 6) Submission
Feb 26 - Final changes, Video Submission

Sync ups over Zoom, Discord, Instagram, Github, and in-person 2-3 times a week that also covers check-ins with each other for progress. We've discussed our expectations as well as our personal workload to accordingly accomodate every member in Group 13.

(UPDATED NOTION/DSL DOCUMENTATION FROM TA FEEDBACK ON JAN 31)

Sample DSL Documentation Link: https://pickled-earthworm-1a6.notion.site/LaTeX-2-0-DSL-Documentation-9abacbd40e0c422db0ef27fb2e32a9d7

*** Example: ***
```
Equation objects are the building blocks of our DSL. 
User can create a fraction object like this:

Create Fraction myFraction

Create is the keyword for starting new objects.
Fraction keyword determines what kind of object to create.
“myFraction” is the name of the object user assigns.
Each object has properties user can set. With a fraction object, you can set the numerator and the denominator like this:

Create Fraction myFraction
myFraction.numerator <- 1
myFraction.denominator <- 2
```

In the GUI, the myFraction object will be rendered as something like this:

![image](https://media.github.students.cs.ubc.ca/user/4103/files/b3711437-1fb8-48cb-8e07-582590dada8a)
___
# Check-in 3

For updated user syntax, please see the updated Notion link above
- changes include a Set operator i.e. Set myFraction.numerator <- 5, to explicitly set the property value
- From TA and group feedback on Jan 31, we discussed the Render function, which can take multiple objects i.e. Render(myFraction, myDerivative)
- As well as dynamic features like arithmetic in-line (mySummation.start <- 1 + 5), conditionals, loops, etc.
- For loops, it won't be hard-coded but rather we will work to incorporate a conditional that will stop the loop
- Recursive functions is still in discussion, but our group believes it's possible for use cases like sequences or series

First user study link: https://docs.google.com/document/d/1jP7a76Skpt2tsQCJGR-CUAz1UIOiH_vOhX9wpejDcc4/edit
- Essentially we are asking the surveyed users on how they would approach problems like writing a loop to create this matrix
![image](https://media.github.students.cs.ubc.ca/user/4103/files/aba7ca94-09b7-4c66-849b-6de010ee1c50)
- The people asked were not of STEM background (i.e. Science / CPSC / Engineering), and instead from areas like Business (i.e. Marketing) and Arts (i.e. Psychology)
- Feedback: People mentioned the questions made sense, however, they lacked the mathematical context (i.e. what's a loop or integral), or LaTeX knowledge. They focused primarily on basic fractions or equations while taking our assistance for the DSL documentation and general math
- Next time for the User Study 2, we plan on asking users who know LaTeX and adding easier examples instead of jumping into a matrix / loop in which many LaTeX users do not have knowledge of

- We also plan on allowing users to add raw LaTeX as well
___
# Check-in 4

Status of implementation

We have the Lexer / Parser ANTLR grammar defined with all of the proper modes (i.e. Block mode - Fraction/LaTeX/Integral/etc.), and the equationObjects working for the first stage with the ParseTree. For unit testing, we have basic Lexer and Parser tests as well as an AST one. Our next focus for ParseTree is the rich features we mentioned such as Render, as well as finishing up the actual implementation of the AST and Visitor Pattern that accompanies it. As our LaTeX project is Evaluation heavy, we’re still in the progress of finalizing the Parser / AST, then collaborating on the Evaluation step, with the rich features and recursive EquationObjects being the biggest challenge. Regarding the UI component, we discovered that there wasn’t an exact Notion API for LaTeX, however, we are planning to either create an UI similar to a website or Sticky Notes that the user can use.

The demographic for the final user study will be people who actually used LaTeX before, which makes sense considering the potential users of this DSL. As we finalize the user study and begin sending it out, we plan on focusing on the basic features such as creating a simple fraction or integral object, then adding 1-2 rich features like creating a matrix, but with more user instruction and an easier to understand task.

This week (~Feb 7), we plan to make sure every group member is on the same level of understanding in the project as we felt that it’s a very end-to-end process, and we can only succeed if every member, for instance, could explain each piece of the components we have (i.e. ParseTree). A couple of members have upcoming midterms this week, so we set aside plenty of time during the weekend, as well as most of the reading break to really sync up and finish the implementation together.

Idea: Similar to a sticky note browser page, the user can make a sticky note strictly for our DSL / LaTeX operations, then click a button (e.g. "Render LaTeX")

![image](https://media.github.students.cs.ubc.ca/user/4103/files/7d47e98c-7ce6-4257-a435-ef0d3aa89150)

___
# Check-in 5

### Status of user study
- Ongoing changes to our final user study, which is similar to our original study, except it's way more simplier and easier to use, avoiding difficult "programmer" language and items like for loops + matrices.

### Example of incremental user changes
Version 1.0: no individual matrix entry modification enabled

Version 2.0: Set myMatrix.element(5,1) <- 1

Version 3.0: Set myMatrix.element <- (1,1) <- 5

We also made certain keywords more explicit, like adding "End" to Loop objects

### Are there any last changes to your design, implementation or tests?
Going with a similar end design to the sticky notes as mentioned during our meeting with our TA, in which there's areas of writing (like sticky notes) that the user can put their notes on. For example, a sticky note can be designated for LaTeX using our DSL, in which the assumption that the entire sticky note will be rendered.

### Video Draft
Make a 3 minute video, capturing your entire process, user studies and their outcome, and evaluating the design and usefulness of your language.

#### Script
1. Introduction to High-Level Purpose of DSL + Target Users
2. Main Features Highlight
3. Preliminary User Test Examples and FeedBack
4. Changes We Made according to Feedback
5. Final User Feedback and Studies
6. Risks of Physical or Emotional Harm of using our DSL
7. Evaluating desgin and usefulness
8. Conclusion and Future Outlook

### Planned Timeline
Meeting many times over the reading break to finish up our implementation, evaluation, frontend, and end to end testing alongside the video.
