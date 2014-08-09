package org.github.triman.utils

/**
 * This class encapsulates an instance of a generic object and contains an
 * operator to return it if it's not null, or a specific instance of the same class if it's not null.
 */
class NullReplace[T](val o : T){
	/**
	 * Returns the object encapsulated if it's not null, the passed object otherwise.
	 * @param r The alternate object
	 */
	def ?? (r : T) : T ={
		if(o == null)	r else o
	} 
}

/**
 * Implicit conversion from any type to NullReplace instance
 */
object NullReplace {
	implicit def t2NullReplace[T](o : T) = new NullReplace(o) 
}
