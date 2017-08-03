public class Stats5 {
  public static void main(String[] args) {
    double float1 = Math.random();
    double float2 = Math.random();
    double float3 = Math.random();
    double float4 = Math.random();
    double float5 = Math.random();
    System.out.println(float1);
    System.out.println(float2);
    System.out.println(float3);
    System.out.println(float4);
    System.out.println(float5);

    System.out.println("Min:" + Math.min(float1, Math.min(float2, Math.min(float3, Math.min(float4, float5)))));
    System.out.println("Max:" + Math.max(float1, Math.max(float2, Math.max(float3, Math.max(float4, float5)))));
    System.out.println("Average:" + (float1 + float2 + float3 + float4 +float5)/5);
  }
}
