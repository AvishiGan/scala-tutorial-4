object Q1 extends App{
    def interest(amount: Double): Double = amount match{
        case x if x<0 => 0
        case x if x<20000 => x*0.02
        case x if x<200000 => x*0.04
        case x if x<2000000 => x*0.35
        case x if x>=200000 => x*0.65
        return x;
    }
    println(interest(100))
}