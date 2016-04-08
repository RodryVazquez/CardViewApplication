package intelectix.cardviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import intelectix.cardviewapplication.Adapters.PersonAdapter;
import intelectix.cardviewapplication.Models.PersonModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Refereciamos el recyclerView de la vista
        recycler = (RecyclerView) findViewById(R.id.recyclerView);
        //Indicamos que el control no va a variar
        recycler.setHasFixedSize(true);

        //Asignamos el adapter al recyclerView
        PersonAdapter personAdapter = new PersonAdapter(GetDummyData());
        recycler.setAdapter(personAdapter);

        //Indicamos la forma en que se desplegaran los datos
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }

    /**
     * @return
     */
    public List<PersonModel> GetDummyData() {

        List<PersonModel> personModels = new ArrayList<>();

        String[] names = getResources().getStringArray(R.array.person_names);
        String lastname = getResources().getString(R.string.person_lastname);
        String job = getResources().getString(R.string.person_job);

        int[] images = new int[]{
                R.drawable.image_one,
                R.drawable.image_two,
                R.drawable.image_three,
                R.drawable.image_four,
                R.drawable.image_five,
                R.drawable.image_six,
                R.drawable.image_seven,
                R.drawable.image_eight,
                R.drawable.image_nine,
                R.drawable.image_ten};

        for (int i = 0; i < names.length; i++) {
            PersonModel personModel = new PersonModel(i, names[i], lastname, job, images[i]);
            personModels.add(personModel);
        }

        return personModels;
    }
}
