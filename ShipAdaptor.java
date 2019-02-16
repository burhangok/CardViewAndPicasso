package turyol.com.turyol;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ShipAdaptor extends BaseAdapter {

    List<ShipItem> shipItemList = new ArrayList<ShipItem>();

    LayoutInflater layoutInflater;

    public ShipAdaptor(Activity activity,List<ShipItem> shipItemList) {
        this.shipItemList = shipItemList;
        this.layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return shipItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return shipItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View rowView = layoutInflater.inflate(R.layout.row_layout,null);

       ShipItem shipItem = shipItemList.get(position);

        TextView nameT = rowView.findViewById(R.id.name);
        ImageView photoI = rowView.findViewById(R.id.photo);

        nameT.setText(shipItem.getShipName());

        Picasso.get().load(shipItem.getShipPhoto()).resize(480,360).into(photoI);

        return rowView;
    }
}
