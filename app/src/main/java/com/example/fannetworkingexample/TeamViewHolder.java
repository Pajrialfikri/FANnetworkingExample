package com.example.fannetworkingexample;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TeamViewHolder extends RecyclerView.ViewHolder {
    TextView textTeamName;
    TextView textTeamId;
    ImageView imageTeamLogo;

    public TeamViewHolder(@NonNull View itemView) {
        super(itemView);
        textTeamName = itemView.findViewById(R.id.text_team_name);
        imageTeamLogo = itemView.findViewById(R.id.image_team_logo);
        textTeamId = itemView.findViewById(R.id.text_team_id);
    }
}
