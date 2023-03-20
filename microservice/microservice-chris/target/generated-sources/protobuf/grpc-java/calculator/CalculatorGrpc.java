package calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: calculator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalculatorGrpc {

  private CalculatorGrpc() {}

  public static final String SERVICE_NAME = "calculator.Calculator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<calculator.CalculatorOuterClass.Request,
      calculator.CalculatorOuterClass.Response> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = calculator.CalculatorOuterClass.Request.class,
      responseType = calculator.CalculatorOuterClass.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<calculator.CalculatorOuterClass.Request,
      calculator.CalculatorOuterClass.Response> getAddMethod() {
    io.grpc.MethodDescriptor<calculator.CalculatorOuterClass.Request, calculator.CalculatorOuterClass.Response> getAddMethod;
    if ((getAddMethod = CalculatorGrpc.getAddMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getAddMethod = CalculatorGrpc.getAddMethod) == null) {
          CalculatorGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<calculator.CalculatorOuterClass.Request, calculator.CalculatorOuterClass.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculator.CalculatorOuterClass.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculator.CalculatorOuterClass.Response.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<calculator.CalculatorOuterClass.Request,
      calculator.CalculatorOuterClass.Response> getMultiplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Multiply",
      requestType = calculator.CalculatorOuterClass.Request.class,
      responseType = calculator.CalculatorOuterClass.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<calculator.CalculatorOuterClass.Request,
      calculator.CalculatorOuterClass.Response> getMultiplyMethod() {
    io.grpc.MethodDescriptor<calculator.CalculatorOuterClass.Request, calculator.CalculatorOuterClass.Response> getMultiplyMethod;
    if ((getMultiplyMethod = CalculatorGrpc.getMultiplyMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getMultiplyMethod = CalculatorGrpc.getMultiplyMethod) == null) {
          CalculatorGrpc.getMultiplyMethod = getMultiplyMethod =
              io.grpc.MethodDescriptor.<calculator.CalculatorOuterClass.Request, calculator.CalculatorOuterClass.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Multiply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculator.CalculatorOuterClass.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculator.CalculatorOuterClass.Response.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("Multiply"))
              .build();
        }
      }
    }
    return getMultiplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<calculator.CalculatorOuterClass.Request,
      calculator.CalculatorOuterClass.Response> getSubtractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subtract",
      requestType = calculator.CalculatorOuterClass.Request.class,
      responseType = calculator.CalculatorOuterClass.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<calculator.CalculatorOuterClass.Request,
      calculator.CalculatorOuterClass.Response> getSubtractMethod() {
    io.grpc.MethodDescriptor<calculator.CalculatorOuterClass.Request, calculator.CalculatorOuterClass.Response> getSubtractMethod;
    if ((getSubtractMethod = CalculatorGrpc.getSubtractMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getSubtractMethod = CalculatorGrpc.getSubtractMethod) == null) {
          CalculatorGrpc.getSubtractMethod = getSubtractMethod =
              io.grpc.MethodDescriptor.<calculator.CalculatorOuterClass.Request, calculator.CalculatorOuterClass.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subtract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculator.CalculatorOuterClass.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculator.CalculatorOuterClass.Response.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("Subtract"))
              .build();
        }
      }
    }
    return getSubtractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<calculator.CalculatorOuterClass.Request,
      calculator.CalculatorOuterClass.Response> getDivideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Divide",
      requestType = calculator.CalculatorOuterClass.Request.class,
      responseType = calculator.CalculatorOuterClass.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<calculator.CalculatorOuterClass.Request,
      calculator.CalculatorOuterClass.Response> getDivideMethod() {
    io.grpc.MethodDescriptor<calculator.CalculatorOuterClass.Request, calculator.CalculatorOuterClass.Response> getDivideMethod;
    if ((getDivideMethod = CalculatorGrpc.getDivideMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getDivideMethod = CalculatorGrpc.getDivideMethod) == null) {
          CalculatorGrpc.getDivideMethod = getDivideMethod =
              io.grpc.MethodDescriptor.<calculator.CalculatorOuterClass.Request, calculator.CalculatorOuterClass.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Divide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculator.CalculatorOuterClass.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calculator.CalculatorOuterClass.Response.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("Divide"))
              .build();
        }
      }
    }
    return getDivideMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorStub>() {
        @java.lang.Override
        public CalculatorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorStub(channel, callOptions);
        }
      };
    return CalculatorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorBlockingStub>() {
        @java.lang.Override
        public CalculatorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorBlockingStub(channel, callOptions);
        }
      };
    return CalculatorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorFutureStub>() {
        @java.lang.Override
        public CalculatorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorFutureStub(channel, callOptions);
        }
      };
    return CalculatorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculatorImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Adds two numbers
     * </pre>
     */
    public void add(calculator.CalculatorOuterClass.Request request,
        io.grpc.stub.StreamObserver<calculator.CalculatorOuterClass.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * Multiplies two numbers
     * </pre>
     */
    public void multiply(calculator.CalculatorOuterClass.Request request,
        io.grpc.stub.StreamObserver<calculator.CalculatorOuterClass.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subtract two numbers
     * </pre>
     */
    public void subtract(calculator.CalculatorOuterClass.Request request,
        io.grpc.stub.StreamObserver<calculator.CalculatorOuterClass.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubtractMethod(), responseObserver);
    }

    /**
     * <pre>
     * Divide two numbers
     * </pre>
     */
    public void divide(calculator.CalculatorOuterClass.Request request,
        io.grpc.stub.StreamObserver<calculator.CalculatorOuterClass.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDivideMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                calculator.CalculatorOuterClass.Request,
                calculator.CalculatorOuterClass.Response>(
                  this, METHODID_ADD)))
          .addMethod(
            getMultiplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                calculator.CalculatorOuterClass.Request,
                calculator.CalculatorOuterClass.Response>(
                  this, METHODID_MULTIPLY)))
          .addMethod(
            getSubtractMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                calculator.CalculatorOuterClass.Request,
                calculator.CalculatorOuterClass.Response>(
                  this, METHODID_SUBTRACT)))
          .addMethod(
            getDivideMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                calculator.CalculatorOuterClass.Request,
                calculator.CalculatorOuterClass.Response>(
                  this, METHODID_DIVIDE)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorStub extends io.grpc.stub.AbstractAsyncStub<CalculatorStub> {
    private CalculatorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorStub(channel, callOptions);
    }

    /**
     * <pre>
     * Adds two numbers
     * </pre>
     */
    public void add(calculator.CalculatorOuterClass.Request request,
        io.grpc.stub.StreamObserver<calculator.CalculatorOuterClass.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Multiplies two numbers
     * </pre>
     */
    public void multiply(calculator.CalculatorOuterClass.Request request,
        io.grpc.stub.StreamObserver<calculator.CalculatorOuterClass.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subtract two numbers
     * </pre>
     */
    public void subtract(calculator.CalculatorOuterClass.Request request,
        io.grpc.stub.StreamObserver<calculator.CalculatorOuterClass.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubtractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Divide two numbers
     * </pre>
     */
    public void divide(calculator.CalculatorOuterClass.Request request,
        io.grpc.stub.StreamObserver<calculator.CalculatorOuterClass.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculatorBlockingStub> {
    private CalculatorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Adds two numbers
     * </pre>
     */
    public calculator.CalculatorOuterClass.Response add(calculator.CalculatorOuterClass.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Multiplies two numbers
     * </pre>
     */
    public calculator.CalculatorOuterClass.Response multiply(calculator.CalculatorOuterClass.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subtract two numbers
     * </pre>
     */
    public calculator.CalculatorOuterClass.Response subtract(calculator.CalculatorOuterClass.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubtractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Divide two numbers
     * </pre>
     */
    public calculator.CalculatorOuterClass.Response divide(calculator.CalculatorOuterClass.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDivideMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorFutureStub extends io.grpc.stub.AbstractFutureStub<CalculatorFutureStub> {
    private CalculatorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Adds two numbers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<calculator.CalculatorOuterClass.Response> add(
        calculator.CalculatorOuterClass.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Multiplies two numbers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<calculator.CalculatorOuterClass.Response> multiply(
        calculator.CalculatorOuterClass.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Subtract two numbers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<calculator.CalculatorOuterClass.Response> subtract(
        calculator.CalculatorOuterClass.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubtractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Divide two numbers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<calculator.CalculatorOuterClass.Response> divide(
        calculator.CalculatorOuterClass.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_MULTIPLY = 1;
  private static final int METHODID_SUBTRACT = 2;
  private static final int METHODID_DIVIDE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((calculator.CalculatorOuterClass.Request) request,
              (io.grpc.stub.StreamObserver<calculator.CalculatorOuterClass.Response>) responseObserver);
          break;
        case METHODID_MULTIPLY:
          serviceImpl.multiply((calculator.CalculatorOuterClass.Request) request,
              (io.grpc.stub.StreamObserver<calculator.CalculatorOuterClass.Response>) responseObserver);
          break;
        case METHODID_SUBTRACT:
          serviceImpl.subtract((calculator.CalculatorOuterClass.Request) request,
              (io.grpc.stub.StreamObserver<calculator.CalculatorOuterClass.Response>) responseObserver);
          break;
        case METHODID_DIVIDE:
          serviceImpl.divide((calculator.CalculatorOuterClass.Request) request,
              (io.grpc.stub.StreamObserver<calculator.CalculatorOuterClass.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return calculator.CalculatorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Calculator");
    }
  }

  private static final class CalculatorFileDescriptorSupplier
      extends CalculatorBaseDescriptorSupplier {
    CalculatorFileDescriptorSupplier() {}
  }

  private static final class CalculatorMethodDescriptorSupplier
      extends CalculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getMultiplyMethod())
              .addMethod(getSubtractMethod())
              .addMethod(getDivideMethod())
              .build();
        }
      }
    }
    return result;
  }
}
