package activity.ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
public class SwimmingAndShows extends AppCompatActivity
{
    //declarations

    private Button nextPage2;
    private Button SwimmingButton;
    private Button MovieButton;
    private TextView SwimmingText;
    private TextView MovieText;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swimming_and_shows);
        //initialization
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

        if (SwimmingText.getVisibility() == View.VISIBLE)
        {
            SwimmingText.setVisibility(View.GONE);
        }
        else
        {
            SwimmingText.setVisibility(View.VISIBLE);
        }

    }

    private void changeVisibilityMovie()
    {
        //MusicText visible settings
        if (MovieText.getVisibility() == View.VISIBLE)
        {
            MovieText.setVisibility(View.GONE);
        } else {
            MovieText.setVisibility(View.VISIBLE);
        }
    }



    //listeners
    private void setUpListeners()
    {

        SwimmingButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View SwimmingText)
            {
                changeVisibilitySwimming();
            }

        });

        MovieButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View MovieText) {
                changeVisibilityMovie();
            }

        });

        nextPage2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent returnIntent = new Intent();
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });



    }






}
