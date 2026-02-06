# Portfolio Part 1: Component Brainstorming

- **Name**:Maahir Omar
- **Dot Number**:Omar.196
- **Due Date**:Feb 6@4:10

## Assignment Rubric: 10 Points

## Pre-Assignment

> Before you jump in, we want you to take a moment to share your interests
> below. Use this space to talk about your career goals as well as your personal
> hobbies. These will help you clarify your values before you start
> brainstorming. Plus it helps us get to know you better! Feel free to share
> images in this section.


I am a Computer Science and engineering student and want to work in software engineering. Soccer is a personal interest, both playing and watching it. I enjoy building structured programs that model real systems. A soccer-based component fits both my interests and my career goals.


### Component Designs

> Please use this section to share your designs.

- Component Design #1:PremierLeagueTable
  - **Description**:Models Premier League standings for a season. It stores teams and match results. It can report points and goal difference.
  - **Kernel Methods**:
  void addTeam(String team)

void recordMatch(String home, String away, int homeGoals, int awayGoals)

boolean containsTeam(String team)

  - **Secondary Methods**:
  int getPoints(String team)

  int getGoalDifference(String team)

   String getLeader()

   int size()
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      Yes. Matches update the standings. OSU Standard components are mutable.
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
      Yes. I would store team stats in a Map and update it in recordMatch.
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      Yes. I would use constants for points: WIN=3, DRAW=1, LOSS=0.
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
     Yes. getPoints(team) uses the results stored by recordMatch

- Component Design #2:PremierLeagueMatchHistory
  - **Description**:
  Stores all matches in a season. It can compute team stats from those matches.

  - **Kernel Methods**:
    void addMatch(String home, String away, int homeGoals, int awayGoals)

     int matchCount()
  - **Secondary Methods**:
    int wins(String team)

    int draws(String team)

    int losses(String team)

    int goalsFor(String team)
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      Yes. New matches get added over time.
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
      Yes. I would store matches in a Sequence of match records.
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      No. Stats come from the stored scores.
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      Yes. wins(team) scans matches added by addMatch.

- Component Design #3: PremierLeagueTeamRoster
  - **Description**:
   Models one team’s roster. It stores players and supports basic queries.
  - **Kernel Methods**:
    void addPlayer(String name)

    void removePlayer(String name)

    boolean hasPlayer(String name)
  - **Secondary Methods**:
    int playerCount()

    boolean isEmpty()

    String getCaptain()
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
     Yes. Players can be added and removed.
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
      Yes. I would store players in a Set or Map.
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      Maybe. An enum for positions could help, but it is optional.
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      Yes. playerCount() depends on players added and removed.
## Post-Assignment

The following sections detail everything that you should do once you've
completed the assignment.

