package intelectix.cardviewapplication.Adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import intelectix.cardviewapplication.Models.PersonModel;
import intelectix.cardviewapplication.R;

/**
 * Adapter
 */
public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private List<PersonModel> personModelList;

    public PersonAdapter() {
    }

    /**
     * Seteamos la coleccion con los datos
     *
     * @param personModelList
     */
    public PersonAdapter(List<PersonModel> personModelList) {
        this.personModelList = personModelList;
    }

    /**
     * Referenciamos el xml que se utilizara para el adapter
     * creamos y devolvemos un nuevo viewHolder
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                            .inflate(R.layout.card_view_adapter,parent,false);
        PersonViewHolder personViewHolder = new PersonViewHolder(itemView);
        return personViewHolder;
    }

    /**
     * Asignamos el objeto PersonModel con base a su posicion
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        PersonModel personModel = personModelList.get(position);
        holder.bindPerson(personModel);
    }

    /**
     * @return Tamaño de la coleccion de datos
     */
    @Override
    public int getItemCount() {
        return personModelList.size();
    }

    /**
     * Patron viewHolder
     */
    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        private CircleImageView circleImageView;
        private TextView txtName;
        private TextView txtLastName;
        private TextView txtJob;

        /**
         * Constructor padre,seteamos las referecias de la vista
         *
         * @param itemView
         */
        public PersonViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cardView);
            circleImageView = (CircleImageView)itemView.findViewById(R.id.profile_front);
            txtName = (TextView) itemView.findViewById(R.id.txtPersonName);
            txtLastName = (TextView) itemView.findViewById(R.id.txtPersonLastName);
            txtJob = (TextView) itemView.findViewById(R.id.txtPersonJob);
        }

        /**
         * Asigna el contenido en la vista
         *
         * @param personModel
         */
        public void bindPerson(PersonModel personModel) {

            circleImageView.setImageResource(personModel.getPersonImageId());
            txtName.setText(personModel.getPersonName());
            txtLastName.setText(personModel.getPersonLastName());
            txtJob.setText(personModel.getPersonJob());
        }
    }

}
