# Portfolio Part 3: Component Interfaces

- **Name**:Maahir Omar
- **Dot Number**:Omar.196
- **Due Date**
## Assignment Overview



```java
public interface NaturalNumberKernel extends Standard<NaturalNumber> {
   ...
}
```

Similarly, the enhanced interfaces provides all of the methods that we want
to layer on top of the kernel. Again, by convention, we use the name of the
component directly for the enhanced interface. For example, `NaturalNumber`
would be the name of the enhanced interface, and its skeleton would look as
follows:

```java
public interface NaturalNumber extends NaturalNumberKernel {
   ...
}
```

R





