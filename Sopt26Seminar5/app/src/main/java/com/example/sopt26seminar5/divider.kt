import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

fun RecyclerView.HorizontalDivider() {
    val divider = DividerItemDecoration(context, DividerItemDecoration.HORIZONTAL)
    this.addItemDecoration(divider)
}

fun RecyclerView.verticalDivider() {
    val divider = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
    this.addItemDecoration(divider)
}