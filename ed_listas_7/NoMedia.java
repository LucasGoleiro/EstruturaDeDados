package ed_listas_7;

public class NoMedia {
	public Media media;
	public NoMedia proximo;
	public NoMedia anterior;

	public NoMedia(Media media){
		this.media = media;
		this.anterior = null;
		this.proximo = null;
	}

}
