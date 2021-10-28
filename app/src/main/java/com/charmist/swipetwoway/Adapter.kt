package com.charmist.swipetwoway

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.charmist.swipetwoway.model.ItemType

class Adapter(
    private val isThai: Boolean
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() ,TimelineItemTouchHelperListener{

    private var list = mutableListOf<ItemType>()

    companion object {
        const val HEADER = 1
        const val WITHDRAW = 2
        const val DEPOSIT = 3
        const val OWNER = 4
    }

    override fun getItemCount(): Int = list.size

    fun setList(newList: List<ItemType>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

    fun clearData() {
        list.clear()
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            HEADER -> {
                HeaderViewHolder(
                    layoutInflater.inflate(
                        R.layout.item_transaction_header,
                        parent,
                        false
                    ), isThai
                )
            }
            WITHDRAW -> {
                WithDrawViewHolder(
                    layoutInflater.inflate(
                        R.layout.item_transaction_withdraw,
                        parent,
                        false
                    ), isThai
                )
            }
            DEPOSIT -> {
                DepositViewHolder(
                    layoutInflater.inflate(
                        R.layout.item_transaction_deposit,
                        parent,
                        false
                    ), isThai
                )
            }
            OWNER -> {
                OwnerViewHolder(
                    layoutInflater.inflate(R.layout.item_transaction_owner, parent, false), isThai
                )
            }
            else -> {
                LoadingViewHolder(
                    layoutInflater.inflate(
                        R.layout.item_transaction_owner,
                        parent,
                        false
                    )
                )
            }
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (list[position].type) {
            HEADER -> {
                val viewHolder = holder as HeaderViewHolder
                //val model = list[position] as Header
                viewHolder.bind("model", position)
            }
            WITHDRAW -> {
                val viewHolder = holder as WithDrawViewHolder
               // val model = list[position] as TransactionItemView
                viewHolder.bind("model")
            }
            DEPOSIT -> {
                val viewHolder = holder as DepositViewHolder
               // val model = list[position] as TransactionItemView
                viewHolder.bind("model")
            }
            OWNER -> {
                val viewHolder = holder as OwnerViewHolder
              //  val model = list[position] as TransactionItemView
                viewHolder.bind("model")
            }
        }
    }

    class HeaderViewHolder(private val view: View, private val thai: Boolean) :
        RecyclerView.ViewHolder(view) {
        fun bind(content: String, position: Int) {
        }
    }

    class WithDrawViewHolder(
        private val view: View,
        private val thai: Boolean
    ) :
        RecyclerView.ViewHolder(view) {
        fun bind(model: String) {

            view.setOnClickListener {
                Toast.makeText(view.context,"sdsdsd",Toast.LENGTH_SHORT)
            }
        }
    }

    class DepositViewHolder(
        private val view: View,
        private val thai: Boolean
    ) :
        RecyclerView.ViewHolder(view) {
        fun bind(model: String) {





            view.setOnClickListener {
                Toast.makeText(view.context,"sdsdsd",Toast.LENGTH_SHORT)
            }
        }
    }

    class OwnerViewHolder(
        private val view: View,
        private val thai: Boolean
    ) : RecyclerView.ViewHolder(view) {
        fun bind(model: String) {

            view.setOnClickListener {
                Toast.makeText(view.context,"sdsdsd",Toast.LENGTH_SHORT)
            }
        }
    }

    class LoadingViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onItemSwipeRight(position: Int) {

    }

}
