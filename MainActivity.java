package turyol.com.turyol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    public ListView shipLV;
    public List<ShipItem> shipItemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        shipItemList.add(new ShipItem("ADATEPE - 2","https://www.turyol.com/img/filo/b_a1/Adatepe-2.jpg"));


        ShipItem ship2 = new ShipItem();
        ship2.setShipName("ALTINKAYA - 1");
        ship2.setShipPhoto("https://www.turyol.com/img/filo/b_a1/Altinkaya-1.jpg");

        shipItemList.add(ship2);

        ShipItem ship3 = new ShipItem("AYNACIOĞLU","https://www.turyol.com/img/filo/b_a1/Aynacioglu.jpg");

        shipItemList.add(ship3);


        ShipAdaptor shipAdaptor = new ShipAdaptor(MainActivity.this,shipItemList);

        shipLV.setAdapter(shipAdaptor);

        shipLV.setDividerHeight(13);



    }

    public  void init () {

        shipLV = findViewById(R.id.list);
    }
}
