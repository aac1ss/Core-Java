@FunctionalInterface
interface validate{
	public abstract boolean validation(Book book) throws BadBookContentException;
}