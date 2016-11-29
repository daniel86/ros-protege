---
title: Object Property Description
layout: view
menuPath: Object property views > Description
---
The object property description view is the core of the object property editor.  It allows the logical description of the selected object property to be viewed and edited.  The view comprises a number of sections, which are described below.  Each line in a section corresponds to an axiom in one of the loaded ontologies.

* **Equivalent To** - The selected property is EquivalentTo each of the properties listed in this section.
* **SubProperty Of** - The selected property is a subproperty of each of the properties listed in this section.
* **Inverse Of** - The selected property is the inverse of each of the properties listed in this section.  Note that, although not particularly common, multiple inverses can be specified.  Also, a property may have itself as an inverse.  For example, ```hasSpouse```, so that if ```Mary hasSpouse John``` then ```John hasSpouse Mary```.
* **Domains (Intersection)** - The selected property has each class expression listed in this section in its domain.  If a given property has a given class in its domain this means that any individual that has a value for the property (i.e. is the subject of a relation along the property), will be inferred to be an instance of that domain class.  For example, if ```John hasParent Mary``` and ```Person``` is listed in the domain of ```hasParent```, then ```John``` will be inferred to be an instance of ```Person```.  Note that domain does not mean that, "the class ```Person``` has ```hasParent``` as a property".
* **Ranges (Intersection)** - The selected property has each class expression listed in this section in its range.  If a given property has a given class in its range this means that any individual that is the value for the property (i.e. is the object of a relation along the property), will be inferred to be an instance of that range class.  For example, if ```John hasParent Mary``` and ```Person``` is listed in the range of ```hasParent```, then ```Mary``` will be inferred to be an instance of ```Person```.  Note that range does not mean that, "the class ```Person``` is a value for the ```hasParent``` property".
* **Disjoint With** - The selected property is disjoint with each property that is listed in this section.  If a property ```hasParent``` is disjoint with the property ```hasChild``` then this means that if ```John hasParent Mary``` then it is not the case that ```John hasChild Mary```
* **SuperProperty Of Chain** - The selected property is a super property (i.e. implied by) each chain of properties listed in this section.  Note that each property in a given chain is written separated by "o" (lowercase letter O).  To add a chain click the add button and in the dialog that appears enter the chain using an alternating pattern of property names and lowercase letter O.  Autocompletion may be used to complete property names.