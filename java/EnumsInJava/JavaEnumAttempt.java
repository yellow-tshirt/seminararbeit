public class JavaEnumAttempt {
    
}
interface IMessage<T>{
    T value();
}

class GenericMessages{
    static class StringWrapper{
        public String value;
    }
    static enum TextMessage implements IMessage<StringWrapper>{
        Text(),

        @Override
        value StringWrapper
    }


}


