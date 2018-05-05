package io.grpc.bverify;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 **
 *	API Interface Exported by the Server
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: protos/api.proto")
public final class BVerifyServerAPIGrpc {

  private BVerifyServerAPIGrpc() {}

  public static final String SERVICE_NAME = "api.BVerifyServerAPI";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getIssueReceiptMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.bverify.IssueReceiptRequest,
      io.grpc.bverify.IssueReceiptResponse> METHOD_ISSUE_RECEIPT = getIssueReceiptMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.bverify.IssueReceiptRequest,
      io.grpc.bverify.IssueReceiptResponse> getIssueReceiptMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.bverify.IssueReceiptRequest,
      io.grpc.bverify.IssueReceiptResponse> getIssueReceiptMethod() {
    return getIssueReceiptMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.bverify.IssueReceiptRequest,
      io.grpc.bverify.IssueReceiptResponse> getIssueReceiptMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.bverify.IssueReceiptRequest, io.grpc.bverify.IssueReceiptResponse> getIssueReceiptMethod;
    if ((getIssueReceiptMethod = BVerifyServerAPIGrpc.getIssueReceiptMethod) == null) {
      synchronized (BVerifyServerAPIGrpc.class) {
        if ((getIssueReceiptMethod = BVerifyServerAPIGrpc.getIssueReceiptMethod) == null) {
          BVerifyServerAPIGrpc.getIssueReceiptMethod = getIssueReceiptMethod = 
              io.grpc.MethodDescriptor.<io.grpc.bverify.IssueReceiptRequest, io.grpc.bverify.IssueReceiptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.BVerifyServerAPI", "IssueReceipt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.bverify.IssueReceiptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.bverify.IssueReceiptResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BVerifyServerAPIMethodDescriptorSupplier("IssueReceipt"))
                  .build();
          }
        }
     }
     return getIssueReceiptMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetApprovalRequestsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.bverify.ApprovalsRequest,
      io.grpc.bverify.ApprovalsResponse> METHOD_GET_APPROVAL_REQUESTS = getGetApprovalRequestsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.bverify.ApprovalsRequest,
      io.grpc.bverify.ApprovalsResponse> getGetApprovalRequestsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.bverify.ApprovalsRequest,
      io.grpc.bverify.ApprovalsResponse> getGetApprovalRequestsMethod() {
    return getGetApprovalRequestsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.bverify.ApprovalsRequest,
      io.grpc.bverify.ApprovalsResponse> getGetApprovalRequestsMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.bverify.ApprovalsRequest, io.grpc.bverify.ApprovalsResponse> getGetApprovalRequestsMethod;
    if ((getGetApprovalRequestsMethod = BVerifyServerAPIGrpc.getGetApprovalRequestsMethod) == null) {
      synchronized (BVerifyServerAPIGrpc.class) {
        if ((getGetApprovalRequestsMethod = BVerifyServerAPIGrpc.getGetApprovalRequestsMethod) == null) {
          BVerifyServerAPIGrpc.getGetApprovalRequestsMethod = getGetApprovalRequestsMethod = 
              io.grpc.MethodDescriptor.<io.grpc.bverify.ApprovalsRequest, io.grpc.bverify.ApprovalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.BVerifyServerAPI", "GetApprovalRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.bverify.ApprovalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.bverify.ApprovalsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BVerifyServerAPIMethodDescriptorSupplier("GetApprovalRequests"))
                  .build();
          }
        }
     }
     return getGetApprovalRequestsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSubmitSignatureMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.bverify.SubmitSignatureRequest,
      io.grpc.bverify.SubmitSignatureResponse> METHOD_SUBMIT_SIGNATURE = getSubmitSignatureMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.bverify.SubmitSignatureRequest,
      io.grpc.bverify.SubmitSignatureResponse> getSubmitSignatureMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.bverify.SubmitSignatureRequest,
      io.grpc.bverify.SubmitSignatureResponse> getSubmitSignatureMethod() {
    return getSubmitSignatureMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.bverify.SubmitSignatureRequest,
      io.grpc.bverify.SubmitSignatureResponse> getSubmitSignatureMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.bverify.SubmitSignatureRequest, io.grpc.bverify.SubmitSignatureResponse> getSubmitSignatureMethod;
    if ((getSubmitSignatureMethod = BVerifyServerAPIGrpc.getSubmitSignatureMethod) == null) {
      synchronized (BVerifyServerAPIGrpc.class) {
        if ((getSubmitSignatureMethod = BVerifyServerAPIGrpc.getSubmitSignatureMethod) == null) {
          BVerifyServerAPIGrpc.getSubmitSignatureMethod = getSubmitSignatureMethod = 
              io.grpc.MethodDescriptor.<io.grpc.bverify.SubmitSignatureRequest, io.grpc.bverify.SubmitSignatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.BVerifyServerAPI", "SubmitSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.bverify.SubmitSignatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.bverify.SubmitSignatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BVerifyServerAPIMethodDescriptorSupplier("SubmitSignature"))
                  .build();
          }
        }
     }
     return getSubmitSignatureMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetDataRequestMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.bverify.DataRequest,
      io.grpc.bverify.DataResponse> METHOD_GET_DATA_REQUEST = getGetDataRequestMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.bverify.DataRequest,
      io.grpc.bverify.DataResponse> getGetDataRequestMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.bverify.DataRequest,
      io.grpc.bverify.DataResponse> getGetDataRequestMethod() {
    return getGetDataRequestMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.bverify.DataRequest,
      io.grpc.bverify.DataResponse> getGetDataRequestMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.bverify.DataRequest, io.grpc.bverify.DataResponse> getGetDataRequestMethod;
    if ((getGetDataRequestMethod = BVerifyServerAPIGrpc.getGetDataRequestMethod) == null) {
      synchronized (BVerifyServerAPIGrpc.class) {
        if ((getGetDataRequestMethod = BVerifyServerAPIGrpc.getGetDataRequestMethod) == null) {
          BVerifyServerAPIGrpc.getGetDataRequestMethod = getGetDataRequestMethod = 
              io.grpc.MethodDescriptor.<io.grpc.bverify.DataRequest, io.grpc.bverify.DataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.BVerifyServerAPI", "GetDataRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.bverify.DataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.bverify.DataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BVerifyServerAPIMethodDescriptorSupplier("GetDataRequest"))
                  .build();
          }
        }
     }
     return getGetDataRequestMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAuthPathMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.bverify.PathRequest,
      io.grpc.bverify.PathResponse> METHOD_GET_AUTH_PATH = getGetAuthPathMethodHelper();

  private static volatile io.grpc.MethodDescriptor<io.grpc.bverify.PathRequest,
      io.grpc.bverify.PathResponse> getGetAuthPathMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.bverify.PathRequest,
      io.grpc.bverify.PathResponse> getGetAuthPathMethod() {
    return getGetAuthPathMethodHelper();
  }

  private static io.grpc.MethodDescriptor<io.grpc.bverify.PathRequest,
      io.grpc.bverify.PathResponse> getGetAuthPathMethodHelper() {
    io.grpc.MethodDescriptor<io.grpc.bverify.PathRequest, io.grpc.bverify.PathResponse> getGetAuthPathMethod;
    if ((getGetAuthPathMethod = BVerifyServerAPIGrpc.getGetAuthPathMethod) == null) {
      synchronized (BVerifyServerAPIGrpc.class) {
        if ((getGetAuthPathMethod = BVerifyServerAPIGrpc.getGetAuthPathMethod) == null) {
          BVerifyServerAPIGrpc.getGetAuthPathMethod = getGetAuthPathMethod = 
              io.grpc.MethodDescriptor.<io.grpc.bverify.PathRequest, io.grpc.bverify.PathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.BVerifyServerAPI", "GetAuthPath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.bverify.PathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.bverify.PathResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BVerifyServerAPIMethodDescriptorSupplier("GetAuthPath"))
                  .build();
          }
        }
     }
     return getGetAuthPathMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BVerifyServerAPIStub newStub(io.grpc.Channel channel) {
    return new BVerifyServerAPIStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BVerifyServerAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BVerifyServerAPIBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BVerifyServerAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BVerifyServerAPIFutureStub(channel);
  }

  /**
   * <pre>
   **
   *	API Interface Exported by the Server
   * </pre>
   */
  public static abstract class BVerifyServerAPIImplBase implements io.grpc.BindableService {

    /**
     */
    public void issueReceipt(io.grpc.bverify.IssueReceiptRequest request,
        io.grpc.stub.StreamObserver<io.grpc.bverify.IssueReceiptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIssueReceiptMethodHelper(), responseObserver);
    }

    /**
     */
    public void getApprovalRequests(io.grpc.bverify.ApprovalsRequest request,
        io.grpc.stub.StreamObserver<io.grpc.bverify.ApprovalsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetApprovalRequestsMethodHelper(), responseObserver);
    }

    /**
     */
    public void submitSignature(io.grpc.bverify.SubmitSignatureRequest request,
        io.grpc.stub.StreamObserver<io.grpc.bverify.SubmitSignatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitSignatureMethodHelper(), responseObserver);
    }

    /**
     */
    public void getDataRequest(io.grpc.bverify.DataRequest request,
        io.grpc.stub.StreamObserver<io.grpc.bverify.DataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDataRequestMethodHelper(), responseObserver);
    }

    /**
     */
    public void getAuthPath(io.grpc.bverify.PathRequest request,
        io.grpc.stub.StreamObserver<io.grpc.bverify.PathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAuthPathMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIssueReceiptMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.bverify.IssueReceiptRequest,
                io.grpc.bverify.IssueReceiptResponse>(
                  this, METHODID_ISSUE_RECEIPT)))
          .addMethod(
            getGetApprovalRequestsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.bverify.ApprovalsRequest,
                io.grpc.bverify.ApprovalsResponse>(
                  this, METHODID_GET_APPROVAL_REQUESTS)))
          .addMethod(
            getSubmitSignatureMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.bverify.SubmitSignatureRequest,
                io.grpc.bverify.SubmitSignatureResponse>(
                  this, METHODID_SUBMIT_SIGNATURE)))
          .addMethod(
            getGetDataRequestMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.bverify.DataRequest,
                io.grpc.bverify.DataResponse>(
                  this, METHODID_GET_DATA_REQUEST)))
          .addMethod(
            getGetAuthPathMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.bverify.PathRequest,
                io.grpc.bverify.PathResponse>(
                  this, METHODID_GET_AUTH_PATH)))
          .build();
    }
  }

  /**
   * <pre>
   **
   *	API Interface Exported by the Server
   * </pre>
   */
  public static final class BVerifyServerAPIStub extends io.grpc.stub.AbstractStub<BVerifyServerAPIStub> {
    private BVerifyServerAPIStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BVerifyServerAPIStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BVerifyServerAPIStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BVerifyServerAPIStub(channel, callOptions);
    }

    /**
     */
    public void issueReceipt(io.grpc.bverify.IssueReceiptRequest request,
        io.grpc.stub.StreamObserver<io.grpc.bverify.IssueReceiptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIssueReceiptMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getApprovalRequests(io.grpc.bverify.ApprovalsRequest request,
        io.grpc.stub.StreamObserver<io.grpc.bverify.ApprovalsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetApprovalRequestsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitSignature(io.grpc.bverify.SubmitSignatureRequest request,
        io.grpc.stub.StreamObserver<io.grpc.bverify.SubmitSignatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitSignatureMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDataRequest(io.grpc.bverify.DataRequest request,
        io.grpc.stub.StreamObserver<io.grpc.bverify.DataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDataRequestMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAuthPath(io.grpc.bverify.PathRequest request,
        io.grpc.stub.StreamObserver<io.grpc.bverify.PathResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAuthPathMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   *	API Interface Exported by the Server
   * </pre>
   */
  public static final class BVerifyServerAPIBlockingStub extends io.grpc.stub.AbstractStub<BVerifyServerAPIBlockingStub> {
    private BVerifyServerAPIBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BVerifyServerAPIBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BVerifyServerAPIBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BVerifyServerAPIBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.bverify.IssueReceiptResponse issueReceipt(io.grpc.bverify.IssueReceiptRequest request) {
      return blockingUnaryCall(
          getChannel(), getIssueReceiptMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.bverify.ApprovalsResponse getApprovalRequests(io.grpc.bverify.ApprovalsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetApprovalRequestsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.bverify.SubmitSignatureResponse submitSignature(io.grpc.bverify.SubmitSignatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubmitSignatureMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.bverify.DataResponse getDataRequest(io.grpc.bverify.DataRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDataRequestMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.bverify.PathResponse getAuthPath(io.grpc.bverify.PathRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAuthPathMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   *	API Interface Exported by the Server
   * </pre>
   */
  public static final class BVerifyServerAPIFutureStub extends io.grpc.stub.AbstractStub<BVerifyServerAPIFutureStub> {
    private BVerifyServerAPIFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BVerifyServerAPIFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BVerifyServerAPIFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BVerifyServerAPIFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.bverify.IssueReceiptResponse> issueReceipt(
        io.grpc.bverify.IssueReceiptRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIssueReceiptMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.bverify.ApprovalsResponse> getApprovalRequests(
        io.grpc.bverify.ApprovalsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetApprovalRequestsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.bverify.SubmitSignatureResponse> submitSignature(
        io.grpc.bverify.SubmitSignatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitSignatureMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.bverify.DataResponse> getDataRequest(
        io.grpc.bverify.DataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDataRequestMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.bverify.PathResponse> getAuthPath(
        io.grpc.bverify.PathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAuthPathMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ISSUE_RECEIPT = 0;
  private static final int METHODID_GET_APPROVAL_REQUESTS = 1;
  private static final int METHODID_SUBMIT_SIGNATURE = 2;
  private static final int METHODID_GET_DATA_REQUEST = 3;
  private static final int METHODID_GET_AUTH_PATH = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BVerifyServerAPIImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BVerifyServerAPIImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ISSUE_RECEIPT:
          serviceImpl.issueReceipt((io.grpc.bverify.IssueReceiptRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.bverify.IssueReceiptResponse>) responseObserver);
          break;
        case METHODID_GET_APPROVAL_REQUESTS:
          serviceImpl.getApprovalRequests((io.grpc.bverify.ApprovalsRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.bverify.ApprovalsResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_SIGNATURE:
          serviceImpl.submitSignature((io.grpc.bverify.SubmitSignatureRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.bverify.SubmitSignatureResponse>) responseObserver);
          break;
        case METHODID_GET_DATA_REQUEST:
          serviceImpl.getDataRequest((io.grpc.bverify.DataRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.bverify.DataResponse>) responseObserver);
          break;
        case METHODID_GET_AUTH_PATH:
          serviceImpl.getAuthPath((io.grpc.bverify.PathRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.bverify.PathResponse>) responseObserver);
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

  private static abstract class BVerifyServerAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BVerifyServerAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.bverify.Api.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BVerifyServerAPI");
    }
  }

  private static final class BVerifyServerAPIFileDescriptorSupplier
      extends BVerifyServerAPIBaseDescriptorSupplier {
    BVerifyServerAPIFileDescriptorSupplier() {}
  }

  private static final class BVerifyServerAPIMethodDescriptorSupplier
      extends BVerifyServerAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BVerifyServerAPIMethodDescriptorSupplier(String methodName) {
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
      synchronized (BVerifyServerAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BVerifyServerAPIFileDescriptorSupplier())
              .addMethod(getIssueReceiptMethodHelper())
              .addMethod(getGetApprovalRequestsMethodHelper())
              .addMethod(getSubmitSignatureMethodHelper())
              .addMethod(getGetDataRequestMethodHelper())
              .addMethod(getGetAuthPathMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}