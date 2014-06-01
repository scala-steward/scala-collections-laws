// THIS FILE IS AUTO-GENERATED BY Laws.scala, DO NOT EDIT DIRECTLY
package laws
import scala.reflect.runtime.{universe => ru}
object Instances {
  def mth[T: ru.TypeTag](t: T) = implicitly[ru.TypeTag[T]].tpe.declarations.filter(d => d.isMethod && d.isPublic && !d.isStatic && !d.isConstructor).map(_.name)
  val all = Map(
    "Array[Int]" -> (Array[Int]((0 to 0): _*), classOf[collection.mutable.WrappedArray[Int]], mth(Array[Int]((0 to 0): _*))),
    "collection.IndexedSeq[Int]" -> (collection.IndexedSeq[Int]((0 to 0): _*), classOf[collection.IndexedSeq[Int]], mth(collection.IndexedSeq[Int]((0 to 0): _*))),
    "collection.Iterable[Int]" -> (collection.Iterable[Int]((0 to 0): _*), classOf[collection.Iterable[Int]], mth(collection.Iterable[Int]((0 to 0): _*))),
    "collection.Iterator[Int]" -> (((0 to 0)).iterator, classOf[collection.Iterator[Int]], mth(((0 to 0)).iterator)),
    "collection.LinearSeq[Int]" -> (collection.LinearSeq[Int]((0 to 0): _*), classOf[collection.LinearSeq[Int]], mth(collection.LinearSeq[Int]((0 to 0): _*))),
    "collection.SeqView[Int,Seq[Int]]" -> (Seq((0 to 0): _*).view, classOf[collection.SeqView[Int,Seq[Int]]], mth(Seq((0 to 0): _*).view)),
    "collection.Seq[Int]" -> (collection.Seq[Int]((0 to 0): _*), classOf[collection.Seq[Int]], mth(collection.Seq[Int]((0 to 0): _*))),
    "collection.Set[Int]" -> ((collection.Set.empty[Int] ++(0 to 0)), classOf[collection.Set[Int]], mth((collection.Set.empty[Int] ++(0 to 0)))),
    "collection.SortedSet[Int]" -> ((collection.SortedSet.empty[Int] ++(0 to 0)), classOf[collection.SortedSet[Int]], mth((collection.SortedSet.empty[Int] ++(0 to 0)))),
    "collection.TraversableOnce[Int]" -> ((((0 to 0)).iterator: collection.TraversableOnce[Int]), classOf[collection.TraversableOnce[Int]], mth((((0 to 0)).iterator: collection.TraversableOnce[Int]))),
    "collection.Traversable[Int]" -> (collection.Traversable[Int]((0 to 0): _*), classOf[collection.Traversable[Int]], mth(collection.Traversable[Int]((0 to 0): _*))),
    "collection.immutable.BitSet" -> (collection.immutable.BitSet((0 to 0): _*), classOf[collection.immutable.BitSet], mth(collection.immutable.BitSet((0 to 0): _*))),
    "collection.immutable.HashSet[Int]" -> ((collection.immutable.HashSet.empty[Int] ++(0 to 0)), classOf[collection.immutable.HashSet[Int]], mth((collection.immutable.HashSet.empty[Int] ++(0 to 0)))),
    "collection.immutable.IndexedSeq[Int]" -> (collection.immutable.IndexedSeq[Int]((0 to 0): _*), classOf[collection.immutable.IndexedSeq[Int]], mth(collection.immutable.IndexedSeq[Int]((0 to 0): _*))),
    "collection.immutable.Iterable[Int]" -> (collection.immutable.Iterable[Int]((0 to 0): _*), classOf[collection.immutable.Iterable[Int]], mth(collection.immutable.Iterable[Int]((0 to 0): _*))),
    "collection.immutable.LinearSeq[Int]" -> (collection.immutable.LinearSeq[Int]((0 to 0): _*), classOf[collection.immutable.LinearSeq[Int]], mth(collection.immutable.LinearSeq[Int]((0 to 0): _*))),
    "collection.immutable.ListSet[Int]" -> ((collection.immutable.ListSet.empty[Int] ++(0 to 0)), classOf[collection.immutable.ListSet[Int]], mth((collection.immutable.ListSet.empty[Int] ++(0 to 0)))),
    "collection.immutable.List[Int]" -> (collection.immutable.List[Int]((0 to 0): _*), classOf[collection.immutable.List[Int]], mth(collection.immutable.List[Int]((0 to 0): _*))),
    "collection.immutable.PagedSeq[Int]" -> (({ val temp =(0 to 0); new collection.immutable.PagedSeq[Int]((a,i,j) => { val t2 = temp.slice(i,j); var k=i; t2.foreach{ x => a(k) = x; k+=1 }; if (k==i) -1 else k-i }) }), classOf[collection.immutable.PagedSeq[Int]], mth(({ val temp =(0 to 0); new collection.immutable.PagedSeq[Int]((a,i,j) => { val t2 = temp.slice(i,j); var k=i; t2.foreach{ x => a(k) = x; k+=1 }; if (k==i) -1 else k-i }) }))),
    "collection.immutable.Queue[Int]" -> (collection.immutable.Queue((0 to 0): _*), classOf[collection.immutable.Queue[Int]], mth(collection.immutable.Queue((0 to 0): _*))),
    "collection.immutable.Range" -> (((0 to 0): collection.immutable.Range ), classOf[collection.immutable.Range], mth(((0 to 0): collection.immutable.Range ))),
    "collection.immutable.Seq[Int]" -> (collection.immutable.Seq((0 to 0): _*), classOf[collection.immutable.Seq[Int]], mth(collection.immutable.Seq((0 to 0): _*))),
    "collection.immutable.Set[Int]" -> ((collection.immutable.Set.empty[Int] ++(0 to 0)), classOf[collection.immutable.Set[Int]], mth((collection.immutable.Set.empty[Int] ++(0 to 0)))),
    "collection.immutable.SortedSet[Int]" -> ((collection.immutable.SortedSet.empty[Int] ++(0 to 0)), classOf[collection.immutable.SortedSet[Int]], mth((collection.immutable.SortedSet.empty[Int] ++(0 to 0)))),
    "collection.immutable.Stack[Int]" -> (collection.immutable.Stack((0 to 0): _*), classOf[collection.immutable.Stack[Int]], mth(collection.immutable.Stack((0 to 0): _*))),
    "collection.immutable.Stream[Int]" -> (((0 to 0)).toStream, classOf[collection.immutable.Stream[Int]], mth(((0 to 0)).toStream)),
    "collection.immutable.Traversable[Int]" -> (collection.immutable.Traversable((0 to 0): _*), classOf[collection.immutable.Traversable[Int]], mth(collection.immutable.Traversable((0 to 0): _*))),
    "collection.immutable.TreeSet[Int]" -> (collection.immutable.TreeSet((0 to 0): _* ), classOf[collection.immutable.TreeSet[Int]], mth(collection.immutable.TreeSet((0 to 0): _* ))),
    "collection.immutable.Vector[Int]" -> (collection.immutable.Vector[Int]((0 to 0): _*), classOf[collection.immutable.Vector[Int]], mth(collection.immutable.Vector[Int]((0 to 0): _*))),
    "collection.mutable.ArrayBuffer[Int]" -> (collection.mutable.ArrayBuffer[Int]((0 to 0): _*), classOf[collection.mutable.ArrayBuffer[Int]], mth(collection.mutable.ArrayBuffer[Int]((0 to 0): _*))),
    "collection.mutable.ArraySeq[Int]" -> (collection.mutable.ArraySeq[Int]((0 to 0): _*), classOf[collection.mutable.ArraySeq[Int]], mth(collection.mutable.ArraySeq[Int]((0 to 0): _*))),
    "collection.mutable.ArrayStack[Int]" -> (collection.mutable.ArrayStack[Int]((0 to 0): _*), classOf[collection.mutable.ArrayStack[Int]], mth(collection.mutable.ArrayStack[Int]((0 to 0): _*))),
    "collection.mutable.BitSet" -> ((collection.mutable.BitSet.empty ++(0 to 0)), classOf[collection.mutable.BitSet], mth((collection.mutable.BitSet.empty ++(0 to 0)))),
    "collection.mutable.Buffer[Int]" -> (collection.mutable.Buffer[Int]((0 to 0): _*), classOf[collection.mutable.Buffer[Int]], mth(collection.mutable.Buffer[Int]((0 to 0): _*))),
    "collection.mutable.DoubleLinkedList[Int]" -> (collection.mutable.DoubleLinkedList[Int]((0 to 0): _*), classOf[collection.mutable.DoubleLinkedList[Int]], mth(collection.mutable.DoubleLinkedList[Int]((0 to 0): _*))),
    "collection.mutable.HashSet[Int]" -> ((collection.mutable.HashSet.empty[Int] ++(0 to 0)), classOf[collection.mutable.HashSet[Int]], mth((collection.mutable.HashSet.empty[Int] ++(0 to 0)))),
    "collection.mutable.IndexedSeq[Int]" -> (collection.mutable.IndexedSeq[Int]((0 to 0): _*), classOf[collection.mutable.IndexedSeq[Int]], mth(collection.mutable.IndexedSeq[Int]((0 to 0): _*))),
    "collection.mutable.Iterable[Int]" -> (collection.mutable.Iterable[Int]((0 to 0): _*), classOf[collection.mutable.Iterable[Int]], mth(collection.mutable.Iterable[Int]((0 to 0): _*))),
    "collection.mutable.LinearSeq[Int]" -> (collection.mutable.LinearSeq[Int]((0 to 0): _*), classOf[collection.mutable.LinearSeq[Int]], mth(collection.mutable.LinearSeq[Int]((0 to 0): _*))),
    "collection.mutable.LinkedHashSet[Int]" -> ((collection.mutable.LinkedHashSet.empty[Int] ++(0 to 0)), classOf[collection.mutable.LinkedHashSet[Int]], mth((collection.mutable.LinkedHashSet.empty[Int] ++(0 to 0)))),
    "collection.mutable.LinkedList[Int]" -> (collection.mutable.LinkedList[Int]((0 to 0): _*), classOf[collection.mutable.LinkedList[Int]], mth(collection.mutable.LinkedList[Int]((0 to 0): _*))),
    "collection.mutable.ListBuffer[Int]" -> (collection.mutable.ListBuffer[Int]((0 to 0): _*), classOf[collection.mutable.ListBuffer[Int]], mth(collection.mutable.ListBuffer[Int]((0 to 0): _*))),
    "collection.mutable.MutableList[Int]" -> (collection.mutable.MutableList[Int]((0 to 0): _*), classOf[collection.mutable.MutableList[Int]], mth(collection.mutable.MutableList[Int]((0 to 0): _*))),
    "collection.mutable.PriorityQueue[Int]" -> (collection.mutable.PriorityQueue[Int]((0 to 0): _*), classOf[collection.mutable.PriorityQueue[Int]], mth(collection.mutable.PriorityQueue[Int]((0 to 0): _*))),
    "collection.mutable.Queue[Int]" -> (collection.mutable.Queue[Int]((0 to 0): _*), classOf[collection.mutable.Queue[Int]], mth(collection.mutable.Queue[Int]((0 to 0): _*))),
    "collection.mutable.ResizableArray[Int]" -> (collection.mutable.ResizableArray[Int]((0 to 0): _*), classOf[collection.mutable.ResizableArray[Int]], mth(collection.mutable.ResizableArray[Int]((0 to 0): _*))),
    "collection.mutable.Seq[Int]" -> (collection.mutable.Seq[Int]((0 to 0): _*), classOf[collection.mutable.Seq[Int]], mth(collection.mutable.Seq[Int]((0 to 0): _*))),
    "collection.mutable.Set[Int]" -> ((collection.mutable.Set.empty[Int] ++(0 to 0)), classOf[collection.mutable.Set[Int]], mth((collection.mutable.Set.empty[Int] ++(0 to 0)))),
    "collection.mutable.SortedSet[Int]" -> ((collection.mutable.SortedSet.empty[Int] ++(0 to 0)), classOf[collection.mutable.SortedSet[Int]], mth((collection.mutable.SortedSet.empty[Int] ++(0 to 0)))),
    "collection.mutable.Stack[Int]" -> (collection.mutable.Stack[Int]((0 to 0): _*), classOf[collection.mutable.Stack[Int]], mth(collection.mutable.Stack[Int]((0 to 0): _*))),
    "collection.mutable.Traversable[Int]" -> (collection.mutable.Traversable[Int]((0 to 0): _*), classOf[collection.mutable.Traversable[Int]], mth(collection.mutable.Traversable[Int]((0 to 0): _*))),
    "collection.mutable.TreeSet[Int]" -> ((collection.mutable.TreeSet.empty[Int] ++(0 to 0)), classOf[collection.mutable.TreeSet[Int]], mth((collection.mutable.TreeSet.empty[Int] ++(0 to 0)))),
    "collection.mutable.UnrolledBuffer[Int]" -> (collection.mutable.UnrolledBuffer[Int]((0 to 0): _*), classOf[collection.mutable.UnrolledBuffer[Int]], mth(collection.mutable.UnrolledBuffer[Int]((0 to 0): _*))),
    "collection.mutable.WrappedArray[Int]" -> ((Array[Int]((0 to 0): _*): collection.mutable.WrappedArray[Int]), classOf[collection.mutable.WrappedArray[Int]], mth((Array[Int]((0 to 0): _*): collection.mutable.WrappedArray[Int]))),
    "" -> null
  )
}
