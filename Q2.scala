// super class
final case class shoppingCartItem(name: String, price: Double, quantity: Int)

// data structure -> tuple
val item1 = shoppingCartItem("vanilla ice cream", 2.99, 10)
val item2 = shoppingCartItem("chocolate biscuits", 3.99, 3)
val item3 = shoppingCartItem("cupcakes", 4.99, 5)

// data structure -> list
val cart = List(item1, item2, item3)

// print cart items
def print(cart: List[shoppingCartItem]): Unit = {
   cart.foreach { item =>
     println(s"${item.qtyBought} ${item.name} at $$${item.price} each")
   }
 }

print(cart)

def printIceCream(cart: List[shoppingCartItem]): Unit = {
    cart.foreach { {
    case shoppingCartItem("cupcakes", _, _) => println(s"Found a cupcake item.")
    case shoppingCartItem(_,_,_) => println("Found another item.")
    }
   }
 }

 printIceCream(cart)

// output
// 10 vanilla ice cream at $2.99 each
// 3 chocolate biscuits at $3.99 each
// 5 cupcakes at $4.99 each
// Found another item.
// Found another item.
// Found a cupcake item.
 