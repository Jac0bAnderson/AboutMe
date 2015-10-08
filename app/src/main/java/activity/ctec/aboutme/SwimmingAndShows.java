package activity.ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.ImageView;
public class SwimmingAndShows extends AppCompatActivity
{
    //declarations

    private Button nextPage2;
    private Button swimmingButton;
    private Button movieButton;
    private TextView swimmingText;
    private TextView movieText;
    private ImageView swimmingPic;
    private ImageView moviePic;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swimming_and_shows);
        //initialization

        nextPage2 = (Button) findViewById(R.id.nextPage2);
        swimmingButton = (Button) findViewById(R.id.swimmingButton);
        movieButton=(Button) findViewById(R.id.movieButton);
        swimmingText=(TextView) findViewById(R.id.swimmingText);
        movieText=(TextView) findViewById(R.id.movieText);
        swimmingPic=(ImageView) findViewById(R.id.swimmingPic);
        moviePic=(ImageView) findViewById(R.id.moviePic);


        setUpListeners();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_swimming_and_shows, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void changeVisibilitySwimming()
    {
        //Swimmingtext visible settings

        if (swimmingText.getVisibility() == View.VISIBLE)
        {
            swimmingText.setVisibility(View.GONE);
        }
        else
        {
            swimmingText.setVisibility(View.VISIBLE);
        }
        //swimmingPic
        if (swimmingPic.getVisibility() == View.VISIBLE)
        {
            swimmingPic.setVisibility(View.GONE);
        }
        else
        {
            swimmingPic.setVisibility(View.VISIBLE);
        }

    }

    private void changeVisibilityMovie()
    {
        //MusicText visible settings
        if (movieText.getVisibility() == View.VISIBLE)
        {
            movieText.setVisibility(View.GONE);
        } else {
            movieText.setVisibility(View.VISIBLE);
        }
        //moviePic visible settings
        if (moviePic.getVisibility() == View.VISIBLE)
        {
            moviePic.setVisibility(View.GONE);
        } else {
            moviePic.setVisibility(View.VISIBLE);
        }
    }



    private void setUpListeners() {
        swimmingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View SwimmingText) {
                changeVisibilitySwimming();
            }
        });
        movieButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View MovieText) {
                changeVisibilityMovie();
            }
        });
        nextPage2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View buttonView) {
                Intent changeScreen = new Intent(buttonView.getContext(), AboutMe.class);
                startActivityForResult(changeScreen, 2);
            }
        });


    }

}
