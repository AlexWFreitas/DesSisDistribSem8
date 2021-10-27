import React, { useEffect, useState } from "react";
import api from "../services/api";
import "./styles/Style.css";

function Dashboard() {
  const [restaurantes, setRestaurantes] = useState([]);
  useEffect(() => {
    api.get("api/restaurantes/retornaTodos").then((resposta) => {
		setRestaurantes(resposta.data)
    });
  }, []);

  return (
    <div className="row">
		{
			restaurantes.map(restaurante => {				
				return (
					<div className="card" key={restaurante.id}>
						<h2> {restaurante.nome} </h2>
						<p> {restaurante.tipo} </p>
						<span className="text-muted"> {restaurante.local} </span>
					</div>
				)	
			})
		}			      	
    </div>
  );
}

export default Dashboard;
