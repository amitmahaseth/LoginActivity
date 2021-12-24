package adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.loginactivity.R

class PaymentAdapter (private var mContext: Context):RecyclerView.Adapter<PaymentViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentViewHolder {
        val view=LayoutInflater.from(mContext).inflate(R.layout.list_payment,parent,false)
        return PaymentViewHolder(view)

    }


    override fun onBindViewHolder(holder: PaymentViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return 10
    }
}

class PaymentViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

}
