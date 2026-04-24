# Portfolio Part 5: Kernel Implementation

-  Name**: Maahir omar
- **Dot Number**:Omar. 196
- **Due Date**:

## Assignment   Overview

At this point in the portfolio project, the only thing left as far as
implementation is concerned is the kernel implementation. Therefore, you can
treat this final formative assessment as kernel implementation practice. In
other words, assuming that all the other pieces are in order, your job is to
complete a kernel implementation, just like you've done so many times already.

In keeping with the software sequence discipline, you should create the final
class in the form of `Component#`, where `Component` is the name of your
component and `#` is the number of your implementation. For example, using
NaturalNumber, our kernel implementation might be called `NaturalNumber1L`. Note
that by convention, we use the letter `L` to indicate a "thin" layer over an
existing component. For instance, we might call it `NaturalNumber1L` if the
representation is one of the NaturalNumber classes that already exists in Java.
Alternatively, you are welcome to be more explicit in your naming conventions.
For example, if we implement NaturalNumber on an array, we might call it
`NaturalNumberOnArray`. This more closely mirrors the naming style seen in the
Java Collections Framework, such as `HashSet` vs. `TreeSet`. In any case, the
implementation should have the following form:

```java
public class NaturalNumber1L extends NaturalNumberSecondary {
   ...
}
```

As a reminder, the kernel implementation should only contain implementations
of the kernel and Standard methods. You may also implement the Iterable methods
at this point. Likewise, you will need to define at least one constructor.
Finally, you **must** specify the convention and correspondence at the top
of the file. Feel free to reference any of your kernel implementations for
examples of these.

## Assignment Checklist


## Pre-Assignment Tasks

> While you're nearing the end of a complete component implementation, there are
> still a few challenging questions to answer. The one we will be focusing on
> right now is the choice of representation. In other words, how do you plan
> to model your component using other data structures? For the first time this
> semester, you will be selecting your own representation, and you will be
> defining your own convention and correspondence for this representation.
> Rather than jumping into the code, take a moment to actually select that
> representation now and justify it. Feel free to also use this space to
> discuss how that representation will be restricted (i.e., by convention)
> and interpreted (i.e., by correspondence).

I used a map to store the table. Each team is a key, and its points are the value. This makes it easy to check if a team exists, add teams, and update points after matches. The convention is that team names are not empty and points are never negative. The correspondence is that each key represents a team, and the value is that team’s current points.

