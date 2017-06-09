/**
 *   Copyright Alex Sherwin and other contributors as noted.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.missinglink.http.exception;

/**
 * @author alex.sherwin
 * 
 */
public class HttpInvocationException extends HttpClientException {

  private static final long serialVersionUID = 1L;

  /**
   * 
   */
  public HttpInvocationException() {
    super();
  }

  /**
   * @param message String
   * @param cause Throwable
   */
  public HttpInvocationException(final String message, final Throwable cause) {
    super(message, cause);
  }

  /**
   * @param message String
   */
  public HttpInvocationException(final String message) {
    super(message);
  }

  /**
   * @param cause Throwable
   */
  public HttpInvocationException(final Throwable cause) {
    super(cause);
  }

}
