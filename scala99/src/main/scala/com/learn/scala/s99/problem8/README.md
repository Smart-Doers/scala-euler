###The following problem is taken from (http://aperiodic.net/phil/scala/s-99/).
<p>
 Eliminate consecutive duplicates of list elements.<br/>
 If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.<br/>
 Example:<br/>

 scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))<br/>
 res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)<br/>
</p>
