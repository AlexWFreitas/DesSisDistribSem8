import React from 'react';
import { Link } from 'react-router-dom';
import './styles/Style.css';

function LandingPage() {
	return (
		<div className="pagina-principal">
			<div className="conteudo">
				<div className="preco">
					Pratos a partir de R$159,90.
				</div>
				<h1 className="slogan">COMER MUDA TUDO</h1>

				<Link to ="/dashboard" className="botao"> Verificar </Link>
			</div>
		</div>
	)
}

export default LandingPage;