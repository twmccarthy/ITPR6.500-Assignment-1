package main.java.nz.twm.assignment1;

import java.util.List;

public class FileConverter {
	
	public List<Character> encodeTxtToZap(List<Character> text) {
		SimpleEncoder encoder = new SimpleEncoder();
		return encoder.encode(text);
	}
	
	public List<Character> compressZapToCzp(List<Character> text) {
		Compressor compressor = new Compressor();	
		return compressor.compress(text);
	}
	
	public List<Character> decodeZapToTxt(List<Character> text) {
		SimpleDecoder decoder = new SimpleDecoder();
		return decoder.decode(text);
	}
	
	public List<Character> uncompressCzpToZap(List<Character> text) {
		Compressor compressor = new Compressor();
		return compressor.uncompress(text);
	}
}
