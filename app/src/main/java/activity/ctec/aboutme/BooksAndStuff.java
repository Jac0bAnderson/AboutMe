package activity.ctec.aboutme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
public class BooksAndStuff extends AppCompatActivity {

    private Button homeButton;
    private Button bookButton;
    private TextView bookText;
    private ImageView bookPic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_and_stuff);

        bookButton = (Button) findViewById(R.id.bookButton);
        bookText = (TextView) findViewById(R.id.bookText);

        homeButton =(Button) findViewById(R.id.homeButton);
        bookPic =(ImageView) findViewById(R.id.bookPic);

        setUpListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_books_and_stuff, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void changeVisibility() {
        //Gametext visible settings

        if (bookText.getVisibility() == View.VISIBLE) {
            bookText.setVisibility(View.GONE);


        } else {
            bookText.setVisibility(View.VISIBLE);
        }
        //gamePic visible settings
        if (bookPic.getVisibility() == View.VISIBLE) {
            bookPic.setVisibility(View.GONE);


        } else {
            bookPic.setVisibility(View.VISIBLE);
        }

    }




    private void setUpListeners() {

        bookButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View GamesText) {
                changeVisibility();
            }
        });



        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View buttonView)
            {
                Intent returnIntent = new Intent();
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });


    }




}
