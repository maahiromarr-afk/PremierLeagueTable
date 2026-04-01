# Portfolio Part 4: Abstract Class

- **Name**:Maahir Omar
- **Dot Number**:Omar.196
- **Due Date**:April 1 @4:10

## Assignment Overview

Now that you've had a chance to refine your designs a bit, it's time to start
writing some code. In this assignment, you will be making your first abstract
class. The abstract class will take on the name `ComponentSecondary`, where
`Component` is the name of your component. For example, if you're making a
NaturalNumber component, the abstract class would be called
`NaturalNumberSecondary` as follows:

```java
public abstract class NaturalNumberSecondary implements NaturalNumber {
   ...
}
```

Inside the abstract class, you will implement every secondary method you
specified in the enhanced interface. Because the secondary abstract class is
layered over the kernel interface, you cannot implement the methods of your
enhanced interface using the underlying representation. As a result, these
methods must be implemented using the kernel methods only.

Surprisingly, you have done this several times before without probably realizing
it. For example, when you first learned recursion in software 1, [you were
tasked with implementing the secondary methods of NaturalNumber][lab-14]. At the
time, they were static methods, but you were tasked with only implementing the
secondary methods using the kernel methods.

You did this a few other times as well. For example, we asked you to
[implement the secondary methods for set at one point][lab-21]. We did this by
having you extend `Set1L`, so you could override the implementation of
`remove()` and `add()`. At the time, we didn't force you to only use kernel
methods, but the premise remains the same. Meanwhile, in a later lab, you were
tasked with implementing the secondary method `sort()` of `Queue`.

Once you have implemented all of the secondary methods, you must also implement
the key `Object` methods. It's up to you to decide which ones you want to
implement, but `toString()` and `equals()` are a great start. You may also
implement `hashCode()` if you so choose. Note that these methods do not have
access to the representation, so you must also implement them using the kernel
methods only.

