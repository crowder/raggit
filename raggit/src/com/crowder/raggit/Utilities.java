/**
 * @author Brian Crowder
 *
 */

package com.crowder.raggit;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utilities {
  public static String convertInputStreamToString(InputStream is) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(is));
    StringBuilder sb = new StringBuilder();

    String line;
    while ((line = br.readLine()) != null)
      sb.append(line);

    return sb.toString();
  }

  public static byte[] convertInputStreamToByteArray(InputStream is) throws IOException
  {
    ByteArrayOutputStream os = new ByteArrayOutputStream();
    byte[] buf = new byte[1024];

    int len;
    while ((len = is.read(buf)) != -1) {
      os.write(buf, 0, len);
    }

    return os.toByteArray();
  }
}